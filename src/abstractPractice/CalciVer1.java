package abstractPractice;

public class CalciVer1 extends CalciVer1A{
	public double power(double a,double b) {
		return Math.pow(a, b);
	}

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		return a+b;
	}
}
