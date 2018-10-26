package com.liulang.user.other;

import java.util.List;


import com.liulang.user.entity.BillActionEntity;
import com.liulang.user.entity.BillActionEntity.Action;
import com.liulang.user.service.IBillActionService;
import com.liulang.user.service.impl.BillActionServiceImpl;

public class BillActionMain {
	public static void main(String[] args) {
		BillActionEntity bill = new BillActionEntity();
		Action localAction = bill.createLocalAction();
		Action crossSystemAction = bill.createCrossSystemAction();
		bill.addAction(localAction).
		addAction(crossSystemAction);
		List<Action> actionList = bill.getActionList();
		System.out.println("===>"+actionList.size());
		IBillActionService billService = new BillActionServiceImpl();
		billService.persist(bill);
		
	}
}
