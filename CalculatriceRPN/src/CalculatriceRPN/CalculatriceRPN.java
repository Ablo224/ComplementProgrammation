package CalculatriceRPN;

import java.util.Scanner;
import java.io.*;

public enum CalculatriceRPN {
	
	CALCULETTE;
	public  void exec(String[] args) {
		try
		{
			SaisieRPN in = new SaisieRPN();
			in.contenuPile();
			in.ihm();
		}
		
		catch(OperandeManquantException e) 
		{ 
			System.out.println(e.getMessage());		
		}
		
		catch(OperandeTropPetitException | OperandeTropGrandException  e)
		{
			SaisieRPN s_erreur=new SaisieRPN();
			System.out.println(e.getMessage());
		}
		
		catch(DivivionParZeroException e)
		{
			System.out.println(e.getMessage());
		}
	}

	

	public static void main(String[] args)
	{
		CALCULETTE.exec(args);
	}
}
