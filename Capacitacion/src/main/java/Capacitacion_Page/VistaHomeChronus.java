package Capacitacion_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class VistaHomeChronus {
	private WebDriver driver;
	
	public VistaHomeChronus(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10) , this);
	}
	
	@FindBy(name = "ctl00$maincontent$Login1$UserName")
	WebElement cajaTexto1;
	
	@FindBy(name = "ctl00$maincontent$Login1$Password")
	WebElement cajaTexto2;
	
	@FindBy(name = "ctl00$maincontent$Login1$LoginButton")
	WebElement iniciar_sesion;
	
	
	
	public void setTexto1(String texto1) {
		cajaTexto1.sendKeys(texto1);
		//cajaTexto1.submit();
	}
	public void setTexto2(String texto2) {
		cajaTexto2.sendKeys(texto2);
	}
	public void iniciar_sesion() {
		iniciar_sesion.click();
	}
	
	/*public void nombreMetodo() {
		WebElement nombreElemento = driver.findElement(By.id("idElemento"));
		String variable = nombreElemento.getText(); 
	}
	*/
	
	

}