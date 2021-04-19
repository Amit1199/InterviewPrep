package in.edac;

class A {
	   B b; 
	} 
	class B { 
	   A a; 
	} 

	public class C{
		public static void main(String[] args) {
			A a = new A(); 
			B b = new B();  
			a.b = b; 
			b.a = a;
		}
	}
	