package com.kata.tower.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kata.tower.service.impl.BuildTowerServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class BuildTowerController {
	
	@Autowired
	BuildTowerServiceImpl buildTowerServiceImpl;
	
	@GetMapping("/tower/{numberOfFloors}")
	public ResponseEntity<List<String>> getpyramidShapedTower (@PathVariable("numberOfFloors") Integer numberOfFloors){
		return buildTowerServiceImpl.getPyramidShapedTower(numberOfFloors);
	}

}
