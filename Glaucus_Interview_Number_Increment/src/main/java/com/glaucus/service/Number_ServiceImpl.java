//File: Number_ServiceImpl.java
//Service class for persisting data on DB.
package com.glaucus.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.glaucus.model.Number_Table;
import com.glaucus.repository.Number_Repository;
/*This class is to perform business login on the request and persist data on the data base.
 * 
 * @see #@Service to identify the class as a service class to the spring application.
 * @author Sidharth Pradhan
*/
@Service
public class Number_ServiceImpl {

	@Autowired
	private Number_Repository numRepo; // injecting Number_Repository dependency.
	
	/*
	 * @see #@Async declare that this method will execute Asynchronously.
	 * 
	 * @see #findById() finds the record present in the databse. we are verifying
	 * the presence of the record and incremetn the value and updating to the DB. If
	 * record dors not persist then creating the object and persisting to the table.
	 */
	@Async
	public Number_Table updateNumber() {
		 Optional<Number_Table> num = numRepo.findById(1);
		 
		 if(num.isPresent()) {
			 Number_Table numTable = num.get();
			 numTable.setNum_to_Increment(numTable.getNum_to_Increment() + 1);
			 //numTable.setNum_to_Increment(0);
			 return numRepo.save(numTable);
		 }else {
			 Number_Table nt = new Number_Table();
			 nt.setId(1);
			 nt.setNum_to_Increment(0);
			 
			 return numRepo.save(nt);
		 }

		
	}

}
