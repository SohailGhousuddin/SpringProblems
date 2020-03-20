package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.domain.*;
import com.example.demo.repository.itemRepository;
import com.example.demo.repository.itemSearchRepository;

@Service
public class itemService {
	List<items> itemList;
	private itemRepository itemRepository;
	private itemSearchRepository itemSearchRepository;
	
	public itemService(itemRepository iR,itemSearchRepository isR)
	{
		this.itemRepository = iR;
		this.itemSearchRepository=isR;
	}

	public Iterable<items> list() {
					//return this.itemRepository.saveAll(items);
		//return this.itemRepository.
		return this.itemRepository.findAll();
		}
	public Iterable<items> getCategory(String category) {
		//return this.itemRepository.saveAll(items);
		
		List<items> resItems = new ArrayList<items>();
		for(items it:this.itemRepository.findAll())
		{
			if(it.getCategory_short_name().startsWith(category))
			{
				resItems.add(it);
			}
		}
		
		
		return resItems;
}
	public Iterable<items> getShortName(String shortName) {
		//return this.itemRepository.saveAll(items);
		List<items> resItems = new ArrayList<items>();
		for(items it:this.itemRepository.findAll())
		{
			if(it.getShort_name().startsWith(shortName))
			{
				resItems.add(it);
			}
		}
		
		
		return resItems;
}
	
	public Iterable<items> saveAll(List<items> items) {
		//return this.itemRepository.saveAll(items);
		return this.itemRepository.saveAll(items);
	}
	
	public items save(items item) {
		//return this.itemRepository.saveAll(items);
		return this.itemRepository.save(item);
	}
		// TODO Auto-generated method stub
	
	
	public Iterable<items> getSearchCategory(String category_short_name) {
		//return this.itemRepository.saveAll(items);
		
		return this.itemSearchRepository.findByCategory(category_short_name);
}
		
}


