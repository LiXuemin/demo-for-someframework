package com.lixuemin.mock.event;

import java.util.List;


/**
 * @program: bwol-icll
 *
 * @description: 页面学习事件
 *
 * @author: lixuemin
 *
 * @create: 2021-04-29
 **/
public class LearningEvent {

    private Long userId;//用户ID
    private String courseCode;//课程编码
    private String pageCode;//页面编码
    private Integer pageType;//页面类型
    private Integer learnStatus;//页面学习状态 已学，未学
    private Integer learnType;//学习类型 新学，复习
    private Long learnStartTime;//本次学习起始时间
    private Long learnEndTime;//本次学习结束时间
    private Integer learnTime;//页面学习时长
    private Integer subject;//学科
    private List<LearningDetailEvent> detailList;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getPageCode() {
        return pageCode;
    }

    public void setPageCode(String pageCode) {
        this.pageCode = pageCode;
    }

    public Integer getPageType() {
        return pageType;
    }

    public void setPageType(Integer pageType) {
        this.pageType = pageType;
    }

    public Integer getLearnStatus() {
        return learnStatus;
    }

    public void setLearnStatus(Integer learnStatus) {
        this.learnStatus = learnStatus;
    }

    public Integer getLearnType() {
        return learnType;
    }

    public void setLearnType(Integer learnType) {
        this.learnType = learnType;
    }

    public Long getLearnStartTime() {
        return learnStartTime;
    }

    public void setLearnStartTime(Long learnStartTime) {
        this.learnStartTime = learnStartTime;
    }

    public Long getLearnEndTime() {
        return learnEndTime;
    }

    public void setLearnEndTime(Long learnEndTime) {
        this.learnEndTime = learnEndTime;
    }

    public Integer getLearnTime() {
        return learnTime;
    }

    public void setLearnTime(Integer learnTime) {
        this.learnTime = learnTime;
    }

    public Integer getSubject() {
        return subject;
    }

    public void setSubject(Integer subject) {
        this.subject = subject;
    }

    public List<LearningDetailEvent> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<LearningDetailEvent> detailList) {
        this.detailList = detailList;
    }
}
