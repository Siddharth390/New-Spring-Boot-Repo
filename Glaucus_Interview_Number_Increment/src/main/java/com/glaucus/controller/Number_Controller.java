//File: Number_Controller.java
//Controller class with REST API end points.
package com.glaucus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.glaucus.model.Number_Table;
import com.glaucus.service.Number_ServiceImpl;

/*This class is the entry point for the request coming from front-end.
 * 
 * @author Sidharth Pradhan
*/
@Controller
public class Number_Controller {


	@Autowired
	private Number_ServiceImpl numService; //	Injected the object pf Service class.
	
	/*
	 * @see #@RequestMapping to map the incoming request to a particular URL
	 * pattern.
	 * 
	 * @see #/updateNumber API, method type = POST
	 * 
	 * @see #numService.updateNumber() Calling the updateNumber method in Service
	 * class to perform the update operation.
	 * 
	 * @param the model needed to be mapped to index.html.
	 * 
	 * @return index.html page after adding the attribute to the model.
	 */
			
	@RequestMapping(value = "/updateNumber", method = RequestMethod.POST)
	public String updteNumber(Model model) {
		
		Number_Table numVal = numService.updateNumber();
		model.addAttribute("tableValue", numVal);  
		return "index";
		
	}
}
