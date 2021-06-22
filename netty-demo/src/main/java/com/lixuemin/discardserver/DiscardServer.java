package com.lixuemin.discardserver;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;


/**
 * @program: demo-for-someframework
 *
 * @description: 启动类
 *
 * @author: lixuemin
 *
 * @create: 2021-04-19
 **/
public class DiscardServer {
    private final int port;

    public DiscardServer(int port) {
        this.port = port;
    }

    public static void main(String[] args) throws Exception {
        int port = args.length > 0 ? Integer.parseInt(args[0]) : 8080;
        new DiscardServer(port).run();
    }

    public void run() throws Exception {
        //接收进来的连接
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        //处理已经被接收的连接
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            //辅助启动类
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap
                //绑定bossGroup和workerGroup
                .group(bossGroup, workerGroup).channel(NioServerSocketChannel.class).childHandler(new ChannelInitializer<SocketChannel>() {
                @Override
                protected void initChannel(SocketChannel ch) throws Exception {
//                        ch.pipeline().addLast(new DiscardServerHandler());
                    ch.pipeline().addLast(new PrintMessageHandler());
                }
            })
                //提供给NioServerSocketChannel用来接收进来的连接
                .option(ChannelOption.SO_BACKLOG, 128)
                //提供给由父管道ServerChannel接收到的连接
                .childOption(ChannelOption.SO_KEEPALIVE, true);

            ChannelFuture channelFuture = serverBootstrap.bind(port).sync();

            channelFuture.channel().closeFuture().sync();
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }
}
