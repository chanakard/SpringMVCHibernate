package com.personnel.springhibernateappbe.SpringHibernateAppBE.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.personnel.springhibernateappbe.SpringHibernateAppBE.dao.CategoryDAO;
import com.personnel.springhibernateappbe.SpringHibernateAppBE.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOimpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<Category>();
	
	static {
		Category cat = new Category();
		cat.setId(1);
		cat.setName("television");
		cat.setDescription("description for tv");
		cat.setImageUrl("CAT_1.png");
		
		categories.add(cat);
		
		
		
		Category cat1 = new Category();
		cat1.setId(2);
		cat1.setName("mobile");
		cat1.setDescription("description for mobile");
		cat1.setImageUrl("CAT_2.png");
		
		categories.add(cat1);
		
		
		Category cat2 = new Category();
		cat2.setId(3);
		cat2.setName("laptop");
		cat2.setDescription("description for lap");
		cat2.setImageUrl("CAT_3.png");
		
		categories.add(cat2);
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		
		for (Category category : categories) {
			if(category.getId() == id)
			{
				return category;
			}
		}
		
		return null;
	}

}
