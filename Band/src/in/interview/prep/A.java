package in.interview.prep;

public class A {
	 protected void run(){
		System.out.println("run method from A class called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("run ho rha he sirf . se");
		for(String s:args)
		{
			System.out.println(s);
		}
	}

}
