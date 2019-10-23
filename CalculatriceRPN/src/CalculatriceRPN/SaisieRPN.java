package CalculatriceRPN;

import java.util.Scanner;
public class SaisieRPN {

	MoteurRPN _mrpn;
	Scanner _sc;
	
	public SaisieRPN() {
	
		_mrpn = new MoteurRPN();
		_sc = new Scanner(System.in);
	}
	
		
	public void ihm()throws OperandeTropPetitException, OperandeTropGrandException, OperandeManquantException, DivivionParZeroException 
	{
		String str = "";
		boolean stop = false;
		System.out.println("Entrée un nombre || Une opération || \"exit\" pour quitter");
		
		while(stop == false)
		{
			if (_sc.hasNextDouble()) {
				_mrpn.ajouterOperande(_sc.nextDouble()); 
				System.out.println(_mrpn.afficher());
				str = _sc.nextLine(); 
			}
			
			else { 
				str = _sc.nextLine();
				if (this.estOperation(str)) 
					if (_mrpn.operationPossible()) { 
						_mrpn.eval(this.returnOperation(str)); 
						System.out.println(_mrpn.afficher());  
					} 
				
					else throw new OperandeManquantException();  
						
				 
				else if (str.equals("exit")) {
					stop = true;
					System.out.println("BYE BYE");
				}
				
				else
					System.out.println("SAISIE INCORRECTE !!!");
			}
		}
		
	}
	
	private boolean estOperation(String str) {
		if (str.length() != 1)
			return false;

		return this.returnOperation(str) != null;
	}
	
	
	private Operation returnOperation(String str) 
	{
		for (Operation op : Operation.values())
			if (str.charAt(0) == op.getOperation())
				return op;
		return null;

	}

}
