package org.ocp.enthuware.test0001.p0001;

public class TestClass {
	public int methodA(int a) {return a*2;}
	public long methodA(int a) {return a;}
	public static void main(String[] args) {
		int i=0;
		i= new TestClass().methodA(2);
		System.out.println(i);
	}

}
