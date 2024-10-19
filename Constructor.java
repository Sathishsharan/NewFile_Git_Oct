package com.java;

public class Constructor {
	
private  Constructor() {
System.out.println("Sathish");
}

private Constructor(String s) {
System.out.println(s);
}

public static void main(String[] args) {
	
	Constructor obj = new Constructor();

	Constructor obj1 = new Constructor("Rajesh");

}

}
