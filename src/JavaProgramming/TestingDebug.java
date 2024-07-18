package JavaProgramming;



public class TestingDebug {

	final int a = 20;
	int b = 30;
	int c = 40;
	public static void main(String[] args) {
		
        TestingDebug td = new TestingDebug();
		td.check(20);
		
		System.out.println("git - global information tracker");
	}
	public void check(int a) {
		a = this.a;
		System.out.println(a);
	}

}
