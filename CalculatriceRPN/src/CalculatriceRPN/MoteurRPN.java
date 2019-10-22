package CalculatriceRPN;

import java.util.*;

public class MoteurRPN {
	
	private Stack<Double> _pile;
	public final double MAX_VALUE = /*Double.MAX_VALUE;*/ 1000000;
	public final double MIN_VALUE = /*Double.MIN_VALUE;*/ 0;

	public MoteurRPN() {
		_pile = new Stack<Double>();
	}
	
	public void ajouterOperande(double operande)throws OperandeTropPetitException, OperandeTropGrandException
	{
		if(operande < MIN_VALUE)
		{
			throw new OperandeTropPetitException();
		}
		else if(operande > MAX_VALUE)
		{
			throw new OperandeTropGrandException();
		}
		_pile.push(operande);
	}
}
