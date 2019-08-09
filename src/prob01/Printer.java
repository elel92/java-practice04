package prob01;

public class Printer{
	int i;
	boolean b;
	double d;
	String s;
	
	public void println(int i) {
		this.i = i;
		System.out.println(i);
	}
	
	public void println(boolean b) {
		this.b = b;
		System.out.println(b);
	}
	
	public void println(double d) {
		this.d = d;
		System.out.println(d);
	}
	
	public void println(String s) {
		this.s = s;
		System.out.println(s);
	}
	
	public void println(int i, boolean b, double d, String s) {
		this.i = i;
		this.b = b;
		this.d = d;
		this.s = s;
	}
}
