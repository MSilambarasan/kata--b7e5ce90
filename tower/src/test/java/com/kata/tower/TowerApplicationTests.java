package com.kata.tower;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import com.kata.tower.exception.InvalidInputException;
import com.kata.tower.service.impl.BuildTowerServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class TowerApplicationTests {
	
	@Autowired
	BuildTowerServiceImpl buildTowerServiceImpl;

	@Test
	public void possitiveTestCases() {
		List<String> result = new ArrayList<String>();
		result.add("  * ");
		result.add(" * * ");
		result.add("* * * ");
		
		assertNotNull(buildTowerServiceImpl.getPyramidShapedTower(3));
		assertEquals(buildTowerServiceImpl.getPyramidShapedTower(3).getStatusCode(), HttpStatus.OK);
		assertEquals(buildTowerServiceImpl.getPyramidShapedTower(3).getBody(), result);
	}

	@Test(expected = InvalidInputException.class)
	public void negativeTestCases() {
		assertEquals(buildTowerServiceImpl.getPyramidShapedTower(0).getStatusCode(), HttpStatus.BAD_REQUEST);
		assertEquals(buildTowerServiceImpl.getPyramidShapedTower(-1).getStatusCode(), HttpStatus.BAD_REQUEST);
	}
	
}
