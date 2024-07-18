package JavaProgramming;

class JavaAnother
{

	public static void s3()
	{
		System.out.println("Testing");
	}
}

public class JavaAnotherClass{

	public static void s2()
	{
		System.out.println("Testing");
	}
	public static void main(String[] args) 
	{
		
		s2();
		JavaAnother JA = new JavaAnother();
		JA.s3();
	}

}
