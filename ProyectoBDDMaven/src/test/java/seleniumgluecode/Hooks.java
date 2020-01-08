package seleniumgluecode;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	// Variables de tipo estáticas
		private static ChromeDriver driver;
		private static int numberOfCase = 0; 
		
	@Before
	public void setUp() {
		numberOfCase ++;
		System.out.println("Se está ejecutando el escenario Nro. " + numberOfCase);
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://imalittletester.com/");
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		System.out.println("El escenario " + numberOfCase + " se ejecutó correctamente.");
		driver.quit();
	}
	
	public static ChromeDriver getDriver() {
		return driver;
	}
}
