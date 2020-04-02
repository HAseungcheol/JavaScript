package com.yedam.countries;

import java.util.List;

public class CountriesSample {

	public static void main(String[] args) {
		CountriesService service = new CountriesServiceImpl();
		List<Countries> list = service.getCountrieslist();
		for (Countries s : list) {
			System.out.println(s.toString());

		}
	}
}