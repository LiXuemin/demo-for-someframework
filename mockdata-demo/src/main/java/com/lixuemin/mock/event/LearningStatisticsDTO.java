package com.lixuemin.mock.event;

import java.io.Serializable;
import lombok.Builder;


/**
 * 学生学习统计信息DTO
 *
 * @author lixuemin
 **/
@Builder
public class LearningStatisticsDTO implements Serializable {
    //用户标识
    private Long userId;
    //页面编码
    private String pageCode;
    //课程编码
    private String courseCode;
    //页面正确率
    private Double percentCorrect;
    //学习时长
    private Long learnTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPageCode() {
        return pageCode;
    }

    public void setPageCode(String pageCode) {
        this.pageCode = pageCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Double getPercentCorrect() {
        return percentCorrect;
    }

    public void setPercentCorrect(Double percentCorrect) {
        this.percentCorrect = percentCorrect;
    }

    public Long getLearnTime() {
        return learnTime;
    }

    public void setLearnTime(Long learnTime) {
        this.learnTime = learnTime;
    }
}
