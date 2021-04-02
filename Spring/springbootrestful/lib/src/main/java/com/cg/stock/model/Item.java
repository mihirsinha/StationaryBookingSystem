package com.cg.stock.model;

public class Item {
	private int code;
	private String name;
	private int quantity;
	private float price;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Item(int code, String name, int quantity, double d) {
		//super();
		this.code = code;
		this.name = name;
		this.quantity = quantity;
		this.price = (float) d;
	}
	public int getQuantity() {
		return quantity;
	}
	@Override
	public String toString() {
		return "Item [code=" + code + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
