package com.lixuemin.mock.event;


/**
 * @program: bwol-icll
 *
 * @description: 学习详情
 *
 * @author: lixuemin
 *
 * @create: 2021-05-07
 **/
public class LearningDetailEvent {
    private String resCode;//资源编码
    private Integer resType;//资源类型
    private Long optTime;//操作时间
    private String ansOption;//作答选项
    private Integer result;//作答结果
    private Integer eventType;//事件类型
    private Long recordStartTime; //跟读开始
    private Long recordEndTime;//跟读结束
    private String recordAudioCode;//跟读音频标识
    private Double recordScore;//跟读分值

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public Integer getResType() {
        return resType;
    }

    public void setResType(Integer resType) {
        this.resType = resType;
    }


    public String getAnsOption() {
        return ansOption;
    }

    public void setAnsOption(String ansOption) {
        this.ansOption = ansOption;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    public Long getOptTime() {
        return optTime;
    }

    public void setOptTime(Long optTime) {
        this.optTime = optTime;
    }

    public Long getRecordStartTime() {
        return recordStartTime;
    }

    public void setRecordStartTime(Long recordStartTime) {
        this.recordStartTime = recordStartTime;
    }

    public Long getRecordEndTime() {
        return recordEndTime;
    }

    public void setRecordEndTime(Long recordEndTime) {
        this.recordEndTime = recordEndTime;
    }

    public String getRecordAudioCode() {
        return recordAudioCode;
    }

    public void setRecordAudioCode(String recordAudioCode) {
        this.recordAudioCode = recordAudioCode;
    }

    public Double getRecordScore() {
        return recordScore;
    }

    public void setRecordScore(Double recordScore) {
        this.recordScore = recordScore;
    }
}
