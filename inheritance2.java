interface intfA {
	void m1();
}

interface intfB {
	void m2();
}
class sample implements intfA, intfB {
	@Override public void m1()
	{
		System.out.println("Welcome: inside first");
	}

	@Override public void m2()
	{
		System.out.println("Welcome: inside second");
	}
}

class GFG {
	public static void main(String[] args)
	{
		sample ob1 = new sample();

		ob1.m1();
		ob1.m2();
	}
}
