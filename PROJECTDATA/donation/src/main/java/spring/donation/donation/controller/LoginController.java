package spring.donation.donation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring.donation.donation.pojos.User;
import spring.donation.donation.service.UserServiceImpl;
@CrossOrigin(allowedHeaders = "*", origins = "*")
@RestController
public class LoginController {
	@Autowired
	UserServiceImpl service;
	
    @RequestMapping(value="/login",method = RequestMethod.POST)
	public ResponseEntity<?>m1(@RequestBody User user)
	{
    	User temp=service.authnticate(user);
    	if(temp!=null)
    	{
    		return new ResponseEntity<User>(user,HttpStatus.OK);
    	}
		return new ResponseEntity<String>("Auth Failed",HttpStatus.NOT_FOUND);
	}
    
    @RequestMapping("/hello")
    public String hello()
    {
    	return "<h2>HELLO</h2>";
    }
}
