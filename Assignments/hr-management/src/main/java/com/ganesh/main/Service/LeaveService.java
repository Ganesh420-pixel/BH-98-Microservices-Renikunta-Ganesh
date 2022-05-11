package com.ganesh.main.Service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganesh.main.Entity.Leave;
import com.ganesh.main.Repository.LeaveRepository;

@Service
public class LeaveService {

	@Autowired
	private LeaveRepository leaveRep;
	
	public Leave save(Leave leave) {
		Random random = new Random();
		Long empId = (long) random.nextInt(100000);
		leave.setId(empId);
		return leaveRep.save(leave);
	}

}
