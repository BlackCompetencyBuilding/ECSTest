package bean;
import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.Test;
import org.testng.Assert;

public class JunitTest {
	public WebDriver driver = null;
	
	/*@Test
		public void testOne(){
			beginAt("http://10.0.0.10:9090/CustomerOnBoard/index1.jsp"); 
	        
	        assertTitleEquals("Login page");
	       setTextField("Uname", "admin");
	        setTextField("Password", "admin");
	      clickLink("register");
	        //submit();
	        assertTitleEquals("Registration Form");
		}*/
	@Test
		public void testOne(){
			
			System.out.println("Junit test case to test getters and setters");
			String Uname = "Admin";
			User u = new User();
			u.setUname(Uname);
			String getName = u.getUname();
			assertEquals(getName, Uname);
		
		
		}

	@Test
	public void testTwo() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", false);
		driver = new FirefoxDriver(capabilities);
		driver.get("http://10.0.0.10:9090/CustomerOnBoard/index1.jsp");
		//driver.get("http://10.0.0.108:8080/job/JunitTest1/ws/WebContent/index1.jsp");
		//Assert.assertTrue(driver.getTitle().contains("Login page"));
	}

	// public static void main(String[] args){

	// String url =
	// "http://localhost:8080/job/Selenium/ws/WebContent/index1.jsp";

	// @Test
	// public void testTwo(){
	// System.setProperty("webdriver.gecko.driver","C:\\Program Files
	// (x86)\\Mozilla Firefox\\firefox.exe");

	// System.setProperty("webdriver.gecko.driver","C:\\Program
	// Files\\geckodriver.exe");
	// WebDriver driver = new FirefoxDriver();
	// File file = new File("C:\\Program Files\\IEDriverServer.exe");
	// System.setProperty("webdriver.ie.driver",file.getAbsolutePath());
	// WebDriver driver = new InternetExplorerDriver();
	// System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
	// driver.get("http://localhost:8080/job/Selenium/ws/WebContent/index1.jsp");
	// driver.get("http://localhost:8080/job/Selenium/ws/WebContent/index1.jsp");
	// Assert.assertTrue(driver.getTitle().contains("Login Page"));
	// }
}
