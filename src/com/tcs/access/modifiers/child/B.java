package com.tcs.access.modifiers.child;
import com.tcs.access.modifiers.A;

public class B {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.age);
	}
}
class C extends A{
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.che);//we can access the protected by inheriting that class
	}
}