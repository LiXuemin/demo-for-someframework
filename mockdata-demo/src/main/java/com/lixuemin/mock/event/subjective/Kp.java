package com.lixuemin.mock.event.subjective;

public class Kp {
	public Kp(String kpCode, String kpName) {
		super();
		this.kpCode = kpCode;
		this.kpName = kpName;
	}
	private String kpCode;
	private String kpName;
	public String getKpCode() {
		return kpCode;
	}
	public void setKpCode(String kpCode) {
		this.kpCode = kpCode;
	}
	public String getKpName() {
		return kpName;
	}
	public void setKpName(String kpName) {
		this.kpName = kpName;
	}
	@Override
	public String toString() {
		return "Kp [kpCode=" + kpCode + ", kpName=" + kpName + "]";
	}
}
