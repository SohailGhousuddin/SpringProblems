package com.example.demo.domain;


import java.util.List;
import com.example.demo.domain.items;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class itemList {
	private List<items> items;
	
	public itemList() {}

	public List<items> getItems() {
		// TODO Auto-generated method stub
		return this.items;
	}
	
	public void setItems(List<items> items)
	{
		this.items=items;
	}

}
