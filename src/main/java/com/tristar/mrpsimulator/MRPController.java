package com.tristar.mrpsimulator;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MRPController {
	
	//@CrossOrigin(origins = "*")
	@GetMapping("/inventory")
	public Inventory inventory(@RequestParam(required = false, defaultValue = "999999") String part) {
		System.out.println("=> Getting inventory for material " + part);
		return new Inventory(part);
	}
	
	//@CrossOrigin(origins = "*")
	@GetMapping("/cost")
	public Cost cost(@RequestParam(required = false, defaultValue = "999999") String part) {
		System.out.println("=> Getting cost for material " + part);
		return new Cost(part);
	}

}
