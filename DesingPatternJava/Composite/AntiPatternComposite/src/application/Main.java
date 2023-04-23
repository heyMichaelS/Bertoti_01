package application;

import models.entities.Garçom;
import models.entities.GestorComposite;

public class Main {

	public static void main(String[] args) {
		Garçom garçom = new Garçom("Douglas", "garçom");
		GestorComposite gerente = new GestorComposite("Cleiton", "Gerente");
		gerente.add(garçom);
		garçom.add(gerente);
		System.out.println(gerente.getNome());
	}

}
