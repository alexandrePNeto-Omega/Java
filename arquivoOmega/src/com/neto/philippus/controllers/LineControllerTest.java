package com.neto.philippus.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LineControllerTest {

	LineController lc = new LineController();
	
	@Test
	void checkContent() {
		String c = "04|143|4772|7|07388844000443|20201101|026207|249703644|054171|1|2627|2580|20201202|20201202|0|2627|2580|20201202|20201202|0|1|415787348";
		
		Boolean f = lc.checkContent(c, "143");
		
		assertEquals(true, f);
	}
	
	@Test
	void setLines () {
		String path = "C:\\Users\\Alexandre\\Documents\\_Java\\a\\projetos-java\\arquivoOmega\\teste.txt";
		
		Boolean f = lc.setLines(path);
		
		assertEquals(true, f);
		
	}	//	setLines
}	//	LineControllerTest