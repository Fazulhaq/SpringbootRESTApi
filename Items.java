package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Items{
	
	@Id
	@SequenceGenerator(	name = "item_sequence", sequenceName = "item_sequence", allocationSize =1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "item_sequence")
	private int itemId;
	private String itemName;
	private Double itemPrice;
	private int itemQty;
	
	public Items() {
		
	}
	public Items(int itemId, String itemName, Double itemPrice, int itemQty) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemQty = itemQty;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Double getItemPrice() {
		return this.itemPrice;
	}
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getItemQty() {
		return itemQty;
	}
	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}

}
