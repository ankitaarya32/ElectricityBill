package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ElectricityController {

	@GetMapping("/")
	public String loadIndexPage() {
		return "index.html";
	}
	
	@GetMapping("/addBill")
	public String loadBillPage() {
		return "postBill.html";
	}
	@GetMapping("/:{id}/edit")
	public String redirecteditBill(@PathVariable String id) {
		System.out.println("checking page"+id);
	
		return "redirect:/edit?id="+id;
		//return "redirect:/bill/:"+id;
			
	}
	
	@GetMapping("/edit")
	public String editBill() {
	
		return "editBill.html";
			
	}
	
	@GetMapping("/edit/:{id}")
	public String editExplicitBill(@PathVariable String id) {
	
		return "redirect:/edit?id="+id;
			
	}
	
	@GetMapping("/bill/:{id}")
	public String editExplicitBillEdit(@PathVariable String id) {
	
		return "redirect:/edit?id="+id;
			
	}
}
