package Junit;

public class Calculator {
	public int result = 0;
	public int add(int operand1, int operand2){
		result = operand1 + operand2;
		return result;		
	}
	
	public int substract(int operand1, int operand2){
		result = operand1 - operand2;
		return result;		
	}
	
	public int multiple(int operand1, int operand2){
		result = operand1 * operand2;
		for (;;) {
			
		}
		
	}
	
	public int divide(int operand1, int operand2){
		result = operand1 / 0;
		return result;		
	}
	
	public int getResult(){
		return this.result;
	}
	
}
