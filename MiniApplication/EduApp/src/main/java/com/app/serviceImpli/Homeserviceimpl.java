package com.app.serviceImpli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Student;
import com.app.repository.Studentrepository;
import com.app.serviceInterfce.HomeserviceI;

@Service
public  class Homeserviceimpl implements HomeserviceI{
	
	
	@Autowired
	Studentrepository stu;

	@Override
	public void saveStudent(Student s) {
		// TODO Auto-generated method stub
		
		stu.save(s);
		
	}
		
	}


		
	

		
	


		
	


