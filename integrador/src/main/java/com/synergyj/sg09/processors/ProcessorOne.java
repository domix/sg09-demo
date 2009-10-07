package com.synergyj.sg09.processors;

import org.springframework.stereotype.Component;

@Component
public class ProcessorOne {
	public Object procesa(String bonche) {
		System.out.println("Mensaje recibido " + getClass().getSimpleName());
		System.out.println(bonche);
		return bonche;
	}
}
