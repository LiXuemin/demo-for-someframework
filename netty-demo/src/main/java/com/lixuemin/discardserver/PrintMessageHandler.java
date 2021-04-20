package com.lixuemin.discardserver;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;


/**
 * @program: demo-for-someframework
 *
 * @description: print message
 *
 * @author: lixuemin
 *
 * @create: 2021-04-19
 **/
public class PrintMessageHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        super.channelRead(ctx, msg);
    }
}
