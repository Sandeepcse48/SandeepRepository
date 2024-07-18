package JavaProgramming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestingDebug {

	final int a = 20;
	int b = 30;
<<<<<<< HEAD
	int c = 40;
=======
	int d = 40;
        int f = 70;
>>>>>>> master
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
