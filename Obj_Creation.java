package com.java;

public class Obj_Creation {
	
private void add() {
	System.out.println(10);
}
private void sub() {
System.out.println(20);

}

public static void main(String[] args) {
	Obj_Creation a = new Obj_Creation();
	a.add();
	
	Obj_Creation b = new Obj_Creation();
	b.sub();
	b.add();
	
	
	
	
}
}
