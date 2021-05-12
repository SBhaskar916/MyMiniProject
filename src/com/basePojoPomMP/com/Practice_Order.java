package com.basePojoPomMP.com;

public class Practice_Order {
	public Practice_Order() {
		System.out.println("1.Practice_Order");
	}

	static {
		System.out.println("2.Static block");
	}

	public static void Demoo() {
		System.out.println("3.static method");
	}

	private static void employee() {
		System.out.println("4.employee");
	}

	static public void main(String[] args) {
		Practice_Order p = new Practice_Order();
		Demoo();
		employee();
	}

}
// 1.static block, 2.constructor, 3.static method, 4.method