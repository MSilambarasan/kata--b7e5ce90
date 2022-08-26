package com.kata.tower.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface BuildTowerService {
	public ResponseEntity<List<String>> getPyramidShapedTower (Integer numberOfFloors);
}
