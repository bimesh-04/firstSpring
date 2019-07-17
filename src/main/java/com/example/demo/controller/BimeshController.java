package com.example.demo.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;

@RestController
public class BimeshController {
	
//	@RequestMapping("/bimesh")
//	public String getBimesh() {
//		return "bimesh";
//	}

//    @RequestMapping("/suren")
//     public Person getPack() {
//    	Person p1 = new Person();
//    	p1.setName("suren");
//    	p1.setAge(25);
//    	p1.setId(1);
//    	
//    	return p1;
//    		
//    }
	
 
    @RequestMapping("/person/{id}/{name}/{age}")
    public Person getPack2(@PathVariable int id, @PathVariable String name, @PathVariable int age) {
   	Person p1 = new Person();
   	p1.setName(name);
   	p1.setAge(age);
   	p1.setId(id);
   	
   	
   	return p1;
   		
   }
	
	@RequestMapping("/same")
	public String getName(@RequestParam String name) {
		return name;
	}
	
	
}
