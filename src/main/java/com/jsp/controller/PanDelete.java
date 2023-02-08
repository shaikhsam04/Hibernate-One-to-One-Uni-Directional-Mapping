package com.jsp.controller;

import com.jsp.Service.PanService;

public class PanDelete {
	public static void main(String[] args) {

		PanService panService = new PanService();
		panService.deletePanById(2);
	}
}
