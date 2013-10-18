package es.miw.upm.git;

public class Suma {
	
	private int operando1;
	private int operando2;
	
	public Suma(int operando1, int operando2){
		this.operando1 = operando1;
		this.operando2 = operando2;
	}
	
	public int sumar(){
		return this.operando1+this.operando2;
	}
}
