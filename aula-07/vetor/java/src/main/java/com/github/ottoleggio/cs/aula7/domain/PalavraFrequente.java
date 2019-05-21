package com.github.ottoleggio.cs.aula7.domain;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;

import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

public class PalavraFrequente {
	
	public static void palavra(String frase) {
		//cria contador
		HashMap<String, Integer> contador = new HashMap<String, Integer>();
		
		//separa palavras da String
		frase.toLowerCase();
		String[] palavras = frase.split(" ");
		
		for (String palavra : palavras) {
			if(contador.containsKey(palavra)) {
				contador.put(palavra, contador.get(palavra)+1);
			}
			else {
				contador.put(palavra,1);
			}
		}
		
		for(String i : contador.keySet()) {
			System.out.println(i + " " + contador.get(i));
		}
		
		Map<String, Integer> sorted = contador
				.entrySet()
				.stream()
				.sorted(comparingByValue())
				.collect(
						toMap(e -> e.getKey(), e -> e.getValue(), (e1,e2) -> e2,
								LinkedHashMap::new));
				
		
		
		/*
		Set<Entry<String, Integer>> entrySet = contador.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String,Integer>>(entrySet);
		
		Collections.sort(list, new Comparator<Entry<String, Integer>>()
				
				)*/
	}

}
