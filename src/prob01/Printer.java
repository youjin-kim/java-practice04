package prob01;

public class Printer{
	private int n1;
	private boolean ok;
	private double n2;
	private String name;

	public void println(int n1) {
		this.n1 = n1;
		System.out.println(n1);
	}

	public void println(boolean ok) {
		this.ok = ok;
		System.out.println(ok);
	}

	public void println(String name) {
		this.name = name;
		System.out.println(name);
	}

	public void println(double n2) {
		this.n2 = n2;
		System.out.println(n2);
	}

	public void println(int n1, boolean ok, double n2, String name) {
		this.n1 = n1;
		this.ok = ok;
		this.n2 = n2;
		this.name = name;
		System.out.println(n1 + ", " + ok + ", " + n2 + ", " + name);
	}

	public int sum(int i, int j, int k) {
		return i+j+k;
	}

	public int sum(int i, int j, int k, int l, int m) {
		return i+j+k+l+m;
	}

	
}
