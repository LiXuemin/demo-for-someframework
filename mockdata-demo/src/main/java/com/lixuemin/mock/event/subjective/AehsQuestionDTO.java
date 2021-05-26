package com.lixuemin.mock.event.subjective;

import java.util.ArrayList;
import java.util.List;


public class AehsQuestionDTO {
	private Long questionId;//考试中心试题ID
	private Long questionType;//考试中心试题类型表的ID：单选：103 多选：104 是非：107 填空：109
	private Long submitTime;//该题提交时间戳 精确到毫秒
	private Long timeFee;//该试题作答耗时，单位为秒
	private Integer score;//试题预设分值
	private Double actualScore;//实际得分
	private Long userId;//用户中心ID，冗余，方便解析完使用
	private Double difficulty;//由自适应推荐试题时发送给考试中心，最终由考试中心传递回来 难：0.2 中：0.5 易0.8
	private List<String> kpCodesMain = new ArrayList<String>();//该试题知识点集合（由自知适应推荐试题时发送给考试中心，最终由考试中心传递回来）
	private List<SubDetailDTO> subDetails = new ArrayList<SubDetailDTO>();//子题集合
	
	private String answerRemark;//主观题教师评语
	private String answerText;//学生主观题作答内容
	private String questionAehs;//试题对应的标注信息
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
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

	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public List<String> getKpCodesMain() {
		return kpCodesMain;
	}
	public void setKpCodesMain(List<String> kpCodesMain) {
		this.kpCodesMain = kpCodesMain;
	}
	public List<SubDetailDTO> getSubDetails() {
		return subDetails;
	}
	public void setSubDetails(List<SubDetailDTO> subDetails) {
		this.subDetails = subDetails;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getQuestionType() {
		return questionType;
	}
	public void setQuestionType(Long questionType) {
		this.questionType = questionType;
	}
	public Double getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(Double difficulty) {
		this.difficulty = difficulty;
	}
	public Double getActualScore() {
		return actualScore;
	}
	public void setActualScore(Double actualScore) {
		this.actualScore = actualScore;
	}
	public String getAnswerRemark() {
		return answerRemark;
	}
	public void setAnswerRemark(String answerRemark) {
		this.answerRemark = answerRemark;
	}
	public String getAnswerText() {
		return answerText;
	}
	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
	public String getQuestionAehs() {
		return questionAehs;
	}
	public void setQuestionAehs(String questionAehs) {
		this.questionAehs = questionAehs;
	}
	
}
