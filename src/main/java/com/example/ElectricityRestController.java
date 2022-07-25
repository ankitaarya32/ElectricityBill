package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class ElectricityRestController {
	@Autowired
	private ElecticityRepo erepo;
	

	@GetMapping("/bill")
	public List<ElectricityBill> findAllBill(){
		return erepo.findAll();
	}
	
	@GetMapping("/bill/fetch/{id}")
	public ElectricityBill findBillById(@PathVariable int id){
		System.out.println("Id check "+id);
		Optional<ElectricityBill> ebill=erepo.findById(id);
		if(ebill.isEmpty()) return null;
		else return ebill.get();
	}
	@PostMapping("/bill")
	public ElectricityBill addBill(@RequestBody ElectricityBill ebill) {
		System.out.println("value is : "+ebill);
		return erepo.save(ebill);
	}
	
	@PutMapping("/bill/:{id}")
	public ElectricityBill updateBill(@RequestBody ElectricityBill ebill,@PathVariable int id) {
		ebill.setId(id);
		return erepo.save(ebill);
	}
	
	@DeleteMapping("/bill/:{id}")
	public String deleteBill(@PathVariable String id) {
		System.out.println("Delete "+id );
		Optional<ElectricityBill> ebill=erepo.findById(Integer.parseInt(id));
		if(ebill.isEmpty()) return null;
		else {
			erepo.deleteById(Integer.parseInt(id));
			return "Electricity Bill with id : "+id+" has been deleted.";
			}
	}
	
	
}
