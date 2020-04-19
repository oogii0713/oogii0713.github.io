package edu.miu.cs.cs472.project.model;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ShoppingCard {
	private List<Item> items;
	public ShoppingCard() {
		items = new ArrayList<>();
	}
	public void removeItem(Item item) {
		items.remove(item);
	}
	public void addItem(Item item) {
		items.add(item);
	}
	
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	public JSONArray getJson() throws JSONException {
		JSONArray js = new JSONArray();
	
		for(Item item : items){
			JSONObject jo = new JSONObject();
			jo.put("name", item.getProduct().getName());
			jo.put("price", item.getPrice());
			jo.put("quantity", item.getQuantity());
			js.put(jo);
		}
		return js;
	}
}
