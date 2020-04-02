package com.yedam.countries;

import java.util.List;

public class CountriesServiceImpl implements CountriesService {
	CountriesDAO dao = new CountriesDAO();
	
	public List<Countries> getCountrieslist(){
		return dao.getCon();
		
	}
	
}
