package com.ganesh.main.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganesh.main.Entity.LeaveManage;
import com.ganesh.main.Repository.LeaveRepository;

@Service
public class LeaveService {

	@Autowired
	private LeaveRepository leaveRep;
	
	public LeaveManage save(LeaveManage leave) {
		
		return leaveRep.save(leave);
	}

}
