package com.example.Internshipcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Internshiprepositary.Repositary;
import com.example.internshipstudents.Student;

@RestController
public class Controller {
	@Autowired
	Repositary r;
	
	@PostMapping("/save")
	public String addData(@RequestBody Student s)
	{
		r.save(s);
		return "Data Added";
	}
	
	@GetMapping("/featch")
	public Student featchById(@RequestParam int id)
	{
		     Optional<Student> s=r.findById(id);
		    return s.get();
	}
	
	@PutMapping("/update")
	public String updateData(@RequestBody Student s)
	{
		r.save(s);
		return "Data Updated";
	}

	@DeleteMapping("/remove")
	public String removeDataById(@RequestBody int id)
	{
		r.deleteById(id);
		return "dada deletd";
	}
	@GetMapping("/findbyname")
	public List<Student> findByName(@RequestParam String name)
	{
		return r.findByName(name);
	}
	
	@GetMapping("/findbyaddress")
	public List<Student> findByAddress(@RequestParam String address)
	{
		return r.findByAddress(address);
	}
	
	@GetMapping("/findbystd")
	public List<Student> findByStd(@RequestParam int std)
	{
		return r.findByStd(std);
	}
	
	@GetMapping("/findbymobileno")
	
		public List<Student> findByMobileno(@RequestParam double mobileno)
		{
			return r.findByMobileno(mobileno);
		}
	
}
