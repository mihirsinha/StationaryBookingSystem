package com.cg.stock.controller;
import com.cg.stock.dao.ItemDaoImpl;
import com.cg.stock.model.Item;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping()
public class ItemController {
	@GetMapping("/test")
	public List<Item> getl()
	{
	ItemDaoImpl o=new ItemDaoImpl();
	 return o.getItemList();
	}
}
