package gitproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\bandi\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver  = new EdgeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Hello this is commited in github by vamshi");
	}

}
