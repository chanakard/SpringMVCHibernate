package com.personnel.springhibernateappbe.SpringHibernateAppBE.dao;

import java.util.List;

import com.personnel.springhibernateappbe.SpringHibernateAppBE.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
