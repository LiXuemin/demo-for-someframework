package server;

import java.io.IOException;
import java.io.InputStream;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;


/**
 * JSR 356是Java实现WebSocket的一套规范，所以首先需要准备一个支持JSR 356的服务器，例如Tomcat、Jetty的最新版本。 JSR
 * 356提供了注解@ServerEndpoint，并需要指定一个路径，用于处理客户端WebSocket请求。
 * 
 * @author Administrator
 * @date 2021年8月4日
 */
@ServerEndpoint("/logs")
public class LogWebSocketHandle {

	private Process process;
	private InputStream inputStream;

	/**
	 * 新的WebSocket请求开启
	 */
	@OnOpen
	public void onOpen(Session session) {
//		System.err.println(ConfigUtils.get("TEST_FILE_PATH"));
		try {
			// 执行tail -f命令
			process = Runtime.getRuntime().exec("tail -f /var/log/syslog");
			inputStream = process.getInputStream();

			// 一定要启动新的线程，防止InputStream阻塞处理WebSocket的线程
			TailLogThread thread = new TailLogThread(inputStream, session);
			thread.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * WebSocket请求关闭
	 */
	@OnClose
	public void onClose() {
		try {
			if (inputStream != null) {
				inputStream.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (process != null) {
			process.destroy();
		}
	}

	@OnError
	public void onError(Throwable thr) {
		thr.printStackTrace();
	}
}