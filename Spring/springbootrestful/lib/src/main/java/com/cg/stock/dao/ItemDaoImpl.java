package com.cg.stock.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.stock.model.Item;


public class ItemDaoImpl implements ItemDao {
	List<Item> itemList=new ArrayList<Item>();
	@Override
	public void addItem(Item item) {
		// TODO Auto-generated method stub
		
	}
	public ItemDaoImpl()
	{
		itemList.add(new Item(101,"Monitor",10,8500.00));
	}
	@Override
	public Item getItemByCode(int code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifyItem(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteItem(Item item) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Item> getItemList() {
		// TODO Auto-generated method stub
		return null;
	}

}
