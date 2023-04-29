package demo;

public class EvenOdd {

	private int num;
	private boolean evenOdd;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public boolean isEvenOdd() {
		return evenOdd;
	}

	public void setEvenOdd(boolean evenOdd) {
		this.evenOdd = evenOdd;
	}

	public void checkEvenOdd() {

		if (num % 2 == 0) {
			evenOdd = true;

		} else {
			evenOdd = false;
		}

	}

}
