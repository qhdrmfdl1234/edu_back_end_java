package hk.edu20240704.day06;

//나눗셈기능
public class D3_CalculatorC {

	public int num1;
	public int num2;
	
	private int result;

	public D3_CalculatorC() {
		this(10,10);
	}

	public D3_CalculatorC(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void a() {
		this.result=this.num1/this.num2;
	}

	public int getResult() {
		return result;
	}
	
	
}



