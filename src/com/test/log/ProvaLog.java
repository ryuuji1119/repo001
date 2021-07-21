package com.test.log;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ProvaLog {



		private static final Logger log = LogManager.getLogger(ProvaLog.class);
		
		public static List<Integer> prova() {
			Random rnd = new Random();
			List<Integer> lista = new ArrayList<>();

			log.debug("numero elementi in lista è {}", lista.size());
			for(Integer i=0; i<10; i++) {
				lista.add(2);
				log.debug("numero elementi {}, in lista è {}",i, lista.size());
			}
			log.info("numero elementi in lista alla fine è {}", lista.size());
			if(lista.size() <=0) {
					log.fatal("Problemi con l'implentazione list");
					throw new RuntimeException("list implementation not working");
			
			
		}return lista;
		}
		public static void main(String[] args) {
			prova();
			log.trace("trace");
			log.fatal("fatal");
			log.error("error");
			log.warn("warn");
		}

	

	

}
