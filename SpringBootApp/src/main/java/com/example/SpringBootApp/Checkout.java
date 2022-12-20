package com.example.SpringBootApp;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


@RequestMapping(path="checkout/{name}")
public class Checkout {
	String LogTyp="Out",i;
	 LocalDate  d;
	 LocalTime t;

@Autowired UserRepo ob;
@GetMapping()
public String getCustomer(@PathVariable("name") String name) {
	
	 d= LocalDate.now();
	 t = LocalTime.now();
	 i= name.concat(t.toString());

     User first = new User(LogTyp,t.toString(),d.toString(),i);

     // ob.save() method 

    
	ob.save(first);

return "Out"+"  "+t.toString()+"  " +d.toString()+"  "+i;
}


}