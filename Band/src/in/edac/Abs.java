package in.edac;

import in.interview.prep.A;

public class Abs extends A{
	void pal(){
		super.run();
	}
	public static void main(String args[])
	{
		System.out.println("Inside Scope class of same package");
		Abs a=new Abs();
		a.pal();
	}
	
}
