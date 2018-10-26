package com.liulang.user.entity;

import java.util.ArrayList;
import java.util.List;

public class BillActionEntity {
	
	public class Action{
		
	}
	private String sysEvtTraceId;//全局跟踪号
	
	private List<Action> actionList = new ArrayList<>();
	public BillActionEntity addAction(Action action) {
		actionList.add(action);
		return this;
	}
	/**
	 * 创建本地记账动作
	 * @return
	 */
	public Action createLocalAction() {
		Action action= new Action();
		return action;
	}
	/**
	 * 创建跨系统记账动作
	 * @return
	 */
	public Action createCrossSystemAction() {
		Action action= new Action();
		return action;
	}
	public String getSysEvtTraceId() {
		return sysEvtTraceId;
	}
	public void setSysEvtTraceId(String sysEvtTraceId) {
		this.sysEvtTraceId = sysEvtTraceId;
	}
	public List<Action> getActionList() {
		return actionList;
	}
}
