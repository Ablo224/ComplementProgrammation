package CalculatriceRPN;

public class OperandeManquantException extends OperationImpossibleException{

	public static final long serialVersionUID = -8266376316408973731L;

	public OperandeManquantException() {
		super("Operation impossible (il faut deux opérandes)");
	}

}
