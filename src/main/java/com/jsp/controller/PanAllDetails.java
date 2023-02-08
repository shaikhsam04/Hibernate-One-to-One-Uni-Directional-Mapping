package com.jsp.controller;

import com.jsp.Service.PanService;
import com.jsp.dto.Pan;

public class PanAllDetails {
	public static void main(String[] args) {

		PanService panService = new PanService();

		for (Pan p : panService.getAllPans()) {
			System.out.println("---------------");
			System.out.println(p.getId());
			System.out.println(p.getName());

		}

	}
}
