import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	WebDriver driver;
	public Driver() {
	}

public void lanzarNavegador(String navegador) {
	navegador = navegador.toLowerCase();
	
switch (navegador)	{
case "google";
System.setProperty("webriver.chrome.driver", "src\\main\\java\resources\\driver\\chromedrive.exe";
driver=new ChromeDriver();

break;

case "firefox";
System.setProperty("webriver.geckc.driver", "src\\main\\java\resources\\driver\\geckod.exe";
driver=new CromeDriver();

break;

case "ie";
String rutaDriver = ".\\src\\main\\java\resources\\drivers\\IEDriverServer.exe";
System.setProperty("webdriver.ie.driver", rutaDriver);
InternetExplorerOptions options = new InternetExplorerOptions();
options.ignorezoomSettings();
options.introduceFlakinessByIgnoringSecurtyDomains();
options.enablePersistentHovering();
options.disableNativeEvents();
driver = new InternetExplorerDriver(options);
break;

default;
break;

}

}// lanzar navegador
public void navegarA(String url) {
	driver.get(url);
	
}

public void cierrenavegador() {
	driver.close();
	
}

}
