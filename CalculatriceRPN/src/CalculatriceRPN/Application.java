package CalculatriceRPN;

import CalculatriceRPN.*;
public class Application {

	public static void main(String[] args) throws OperandeTropPetitException, OperandeTropGrandException, OperandeManquantException, DivivionParZeroException {
		
		MoteurRPN p = new MoteurRPN();
		p.ajouterOperande(20.0);
		p.ajouterOperande(0.0);
		
		p.eval(Operation.DIV);
		System.out.println(p.afficher());

	}

}
