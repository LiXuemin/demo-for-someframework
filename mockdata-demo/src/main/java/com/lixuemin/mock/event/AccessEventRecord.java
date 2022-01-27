package com.lixuemin.mock.event;

import java.util.Map;
import lombok.experimental.SuperBuilder;


/**
 * URL访问事件
 * @author lixuemin
 **/
@SuperBuilder
public class AccessEventRecord extends BaseEventRecord {
    //事件用户唯一标识，userId和sessionId二选一必填
    private Long userId;
    //未登录用户唯一标识，userId和sessionId二选一必填
    private String sessionId;
    //事件发生时间，必填
    private Long eventTime;
    //事件类型，必填
    private String eventType;
    //描述事件的属性
    private Map<String, Object> properties;
}
