package com.kata.tower.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.kata.tower.exception.InvalidInputException;
import com.kata.tower.service.BuildTowerService;

@Service
public class BuildTowerServiceImpl implements BuildTowerService {

	@Override
	public ResponseEntity<List<String>> getPyramidShapedTower(Integer numberOfFloors) {
		if (numberOfFloors > 0) {
			return getPyramid(numberOfFloors);
		} else {
			throw new InvalidInputException("Invalid Argument - It should be greater than Zero");
		}
	}

	public ResponseEntity<List<String>> getPyramid(Integer noOfFloors) {
		List<String> pyramid = new ArrayList<String>();
		String pattern = "";
		for (int i = 0; i < noOfFloors; i++) {
			for (int j = noOfFloors - i; j > 1; j--) {
				pattern += " ";
			}
			for (int j = 0; j <= i; j++) {
				pattern += "* ";
			}
			pyramid.add(pattern);
			pattern = "";
		}
		return new ResponseEntity<List<String>>(pyramid, HttpStatus.OK);
	}
}
