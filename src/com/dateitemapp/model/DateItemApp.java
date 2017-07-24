package com.dateitemapp.model;

import java.io.Serializable;
import java.sql.Date;

public class DateItemApp implements Serializable{
	
	private Integer appNo;
	private Integer memNo;
	private Integer dateItemNo;
	private String  appTitle;
	private String appText;
	private byte[] appImg;
	private Date appDate;
	private Integer appState;
	
	
	public Integer getAppNo() {
		return appNo;
	}
	public void setAppNo(Integer appNo) {
		this.appNo = appNo;
	}
	public Integer getMemNo() {
		return memNo;
	}
	public void setMemNo(Integer memNo) {
		this.memNo = memNo;
	}
	public Integer getDateItemNo() {
		return dateItemNo;
	}
	public void setDateItemNo(Integer dateItemNo) {
		this.dateItemNo = dateItemNo;
	}
	public String getAppTitle() {
		return appTitle;
	}
	public void setAppTitle(String appTitle) {
		this.appTitle = appTitle;
	}
	public String getAppText() {
		return appText;
	}
	public void setAppText(String appText) {
		this.appText = appText;
	}
	public byte[] getAppImg() {
		return appImg;
	}
	public void setAppImg(byte[] appImg) {
		this.appImg = appImg;
	}
	public Date getAppDate() {
		return appDate;
	}
	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}
	public Integer getAppState() {
		return appState;
	}
	public void setAppState(Integer appState) {
		this.appState = appState;
	}
	
	
	

}
