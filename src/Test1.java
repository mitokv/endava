import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterClass;

public class Test1 {
	private static WebDriver driver;
	private String url;
	@Test
  public void test1() {
	  driver.get(url);
	  driver.manage().window().maximize();
	  Sleeper.sleepTightInSeconds(10);
  }
  @BeforeClass
  public void beforeClass() {
	  url = "http://www.google.com";
	  driver = new FirefoxDriver();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
