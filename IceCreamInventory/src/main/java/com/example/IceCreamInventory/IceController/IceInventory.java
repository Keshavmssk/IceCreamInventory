package com.example.IceCreamInventory.IceController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IceInventory 
{	
	@GetMapping("/index")
	   public String index() 
           {
	      return "index";
	   }
}
