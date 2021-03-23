package org.zerock.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleTests {
	
	@Autowired
	private Restaurant restaurant;
	
	@Autowired
	private SampleHotel hotel; //1.SampleHotel test code
	
	@Test
	public void testHotel() {
		
		log.info(hotel); //hotel객체를 찍었을때 나오는지 확인 > testHotel찍고 런
	}
	
	@Test
	public void test() {
		
		System.out.println("test1.......");
		log.info("test1.........");
		log.info(restaurant);
	}
}
