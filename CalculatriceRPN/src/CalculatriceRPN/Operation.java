package CalculatriceRPN;

import CalculatriceRPN.DivivionParZeroException;
public enum Operation {
		
	PLUS('+')
	{
		@Override
		public double eval(double op1,double op2){
			return op1 + op2;
		}
	},
	
	MOINS('-')
	{
		@Override
		public double eval(double op1,double op2) {
			return op1 - op2;
		}
		
	},
	
	MULT('*')
	{
		@Override
		public double eval(double op1,double op2) {
			return op1 * op2;
		}
		
	},
	
	DIV('/')
	{
		@Override
		public double eval(double op1,double op2) {
			return op1 / op2;
		}
		
	};
	
	private char _symbole;
	
	
	
	Operation(char symbole)
	{
		_symbole = symbole;
	}
	
	public abstract double eval(double op1,double op2) throws DivivionParZeroException;
	
	public char getOperation()
	{
		return _symbole;
	}
	
	

}
