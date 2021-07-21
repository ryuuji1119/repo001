package com.test.log;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Test;


class ProvaLogTest {

	@Test
	void testMain() {

		List<Integer> lista = new ArrayList<>();
		Random rnd = new Random();

		for(Integer i=0; i<1000; i++) 
			lista.add(2);
		assertEquals(lista, ProvaLog.prova());
	}

}
