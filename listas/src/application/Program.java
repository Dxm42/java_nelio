package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marcos");
		
		System.out.println(list.size());
		
//		list.remove("Anna");
		
		for(String x: list) {
			System.out.println(x);
		}
		// Função predicado retorna true ou false remove os items conforme a condição 
		list.removeIf(x -> x.charAt(0) == 'M');
		
		System.out.println("_________________");
		for(String x: list) {
			System.out.println(x);
		}
	}
}
