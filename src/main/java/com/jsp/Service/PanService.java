package com.jsp.Service;

import java.util.List;

import com.jsp.dao.PanDao;
import com.jsp.dto.Pan;

public class PanService {
	PanDao panDao = new PanDao();

	public Pan createPan(Pan pan1) {
		return panDao.createPan(pan1);
	}

	public Pan deletePanById(int id) {

		return panDao.deletePanById(id);
	}

	public Pan updatePanById(int id, String name, int pan_no) {

		return panDao.updatePanById(id, name, pan_no);
	}

	public Pan getPanById(int id) {

		return panDao.getPanById(id);
	}

	public List<Pan> getAllPans() {

		return panDao.getAllPans();
	}
}
