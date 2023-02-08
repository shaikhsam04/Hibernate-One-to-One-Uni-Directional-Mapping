package com.jsp.controller;

import com.jsp.Service.PanService;

public class PanRead {
	public static void main(String[] args) {

		PanService panService = new PanService();
		panService.getPanById(1);
	}
}
