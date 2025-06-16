package com.kanechan.ordersolid.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private final List<Item> items;

	public Order() {
		this.items = new ArrayList<>();
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public double calculateTotal() {
		return items.stream().mapToDouble(Item::getPreco).sum();
	}

	public List<Item> getItems() {
		return items;
	}
}
