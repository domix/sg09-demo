package com.synergyj.sg09.processors;

import org.springframework.stereotype.Service;

@Service
public class ProcessorTwo {
	public String procesa(String mensaje) throws Exception {
		System.out.println("Mensaje recibido " + getClass().getSimpleName());
		return mensaje;
	}
}
