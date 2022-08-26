package com.kata.tower.service;

import org.springframework.http.ResponseEntity;

public interface BuildTowerService {
	public ResponseEntity<String> getPyramidShapedTower (Integer numberOfFloors);
}
