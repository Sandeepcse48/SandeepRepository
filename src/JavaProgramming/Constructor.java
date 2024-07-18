package JavaProgramming;

public class Constructor {
	
	//int a = 100;
	public static void main(String[] args)
	{
		Constructor con =new Constructor();
		con.reverseword("Sandeep is a good boy");
		checknumber(123);
		Number(134);
	}
	public void reverseword(String str)
	{
		//String str = "Sandeep is a good boy";
		String finalString =  " ";
	    for(String s2 : str.split(" "))
	    { 
		String reverse = " ";
			for(char a : s2.toCharArray())
			{
				reverse = a + reverse;
			}
		finalString = finalString + reverse + " ";
	    }
		System.out.println(finalString);
	}
	public static void checknumber(int num) 
	{
		String revNumber = " ";
		for(char b :String.valueOf(num).toCharArray())
		{
			revNumber = b + revNumber;
		}
		
		System.out.println(Integer.valueOf(revNumber));
	}
	static int c = 0; 
	public static void Number(int num)
	{ 
		
		int b = 0;
		for(char a : String.valueOf(num).toCharArray())
		{
			b = a - '0';
			b = (int) Math.pow(b, 2);
			c = c + b;
		}
		System.out.println(c);
	}
}
