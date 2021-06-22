package com.lixuemin.mock.event.subjective;

import java.util.List;


/**
 * 答题记录（由考试中心在练习/考试完成时提交的最终结果）
 * @author liuqiao
 * @datetime 2021年1月12日 下午3:37:23
 */
public class AehsAnswerDTO {

    private Long userId;//用户中心ID

    ;
    private Long testId;//练习或者测试ID
    private String type;//答题类型 练习："practice" 测试：“test”
    private Long submitTime;//试卷提交时间精确到毫秒
    private Long serverTime;//服务器接受时间（该字段由自适应系统添加）
    private Long timeFee;//答卷耗时，单位为秒
    private List<AehsQuestionDTO> answerDetail;//试题答题详情集合
    public AehsAnswerDTO() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Long submitTime) {
        this.submitTime = submitTime;
    }

    public Long getTimeFee() {
        return timeFee;
    }

    public void setTimeFee(Long timeFee) {
        this.timeFee = timeFee;
    }

    public List<AehsQuestionDTO> getAnswerDetail() {
        return answerDetail;
    }

    public void setAnswerDetail(List<AehsQuestionDTO> answerDetail) {
        this.answerDetail = answerDetail;
    }

    public Long getServerTime() {
        return serverTime;
    }

    public void setServerTime(Long serverTime) {
        this.serverTime = serverTime;
    }
}
