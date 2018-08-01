package com.nt.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rk.shoppingbackend.dao.CategoryDao;
import com.rk.shoppingbackend.dto.Catergory;

@Repository("categorydao")
public class CatgoryDaoimpl implements CategoryDao {

	private static List<Catergory> categories=new ArrayList<>();
	
	static{
		Catergory cat=new Catergory();
		cat.setId(1);
		cat.setName("mobile");
		cat.setDescription("this is sumsang mobile" );
		cat.setImageUrl("m.jpg");
		cat.setActive(true);
		
		categories.add(cat);
		
	  cat=new Catergory();
		cat.setId(2);
		cat.setName("Television");
		cat.setDescription("this is sumsang mobile" );
		cat.setImageUrl("m.jpg");
		cat.setActive(true);
		
		categories.add(cat);
		
	  cat=new Catergory();
		cat.setId(3);
		cat.setName("computers");
		cat.setDescription("this is sumsang mobile" );
		cat.setImageUrl("m.jpg");
		cat.setActive(true);
		
		categories.add(cat);
		
	}
	
	
	
	@Override
	public List<Catergory> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
