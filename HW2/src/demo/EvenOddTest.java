package demo;

public class EvenOddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EvenOdd eo = new EvenOdd();
		
		eo.setNum(10);
		
		eo.checkEvenOdd();
		
		if(eo.isEvenOdd()) {System.out.println(eo.getNum()+"is even.");}
		else {System.out.println(eo.getNum()+"is odd.");}
		
		
	}
	
	
}
