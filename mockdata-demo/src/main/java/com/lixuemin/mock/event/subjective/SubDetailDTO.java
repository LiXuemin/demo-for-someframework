package com.lixuemin.mock.event.subjective;

import java.util.ArrayList;
import java.util.List;


public class SubDetailDTO {
	private Long subQuestionId ;//子题id
	private Integer score;//该子题预设分值
	private Double actualScore;//实际得分
	private Long userId;//用户中心ID，冗余，方便解析完使用
	private Double difficulty;//由自适应推荐试题时发送给考试中心，最终由考试中心传递回来 难：0.2 中：0.5 易0.8
	private List<String> kpCodesMain = new ArrayList<String>();//该子题知识点集合（由自知适应推荐试题时发送给考试中心，最终由考试中心传递回来）
	
	public List<String> getKpCodesMain() {
		return kpCodesMain;
	}
	public void setKpCodesMain(List<String> kpCodesMain) {
		this.kpCodesMain = kpCodesMain;
	}
	public Long getSubQuestionId() {
		return subQuestionId;
	}
	public void setSubQuestionId(Long subQuestionId) {
		this.subQuestionId = subQuestionId;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Double getActualScore() {
		return actualScore;
	}
	public void setActualScore(Double actualScore) {
		this.actualScore = actualScore;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Double getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(Double difficulty) {
		this.difficulty = difficulty;
	}
}
