package aplicacao;

import dominio.Pessoa;
import dominio.Policial;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1= new Pessoa (1,"Carlos da Silva", "carlos@gmail.com");
		Pessoa p2= new Pessoa (2, "Joaquim torres", "joaquim@gmail.com");
		Pessoa p3= new Pessoa (3, "Mariana lopes", "mariana@gmail.com");
		Policial p4= new Policial (4, "manoel", "manoel@gmail.com", "4m");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4.getDele());
		p4.setDele("12");
		System.out.println(p4.getDele());
	
	
	}

}
