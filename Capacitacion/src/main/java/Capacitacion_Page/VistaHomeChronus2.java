package Capacitacion_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class VistaHomeChronus2 {
	private WebDriver driver;

	public VistaHomeChronus2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	@FindBy(name = "ctl00$maincontent$ProjectListGridViewRC$ctl03$ClInsert")
	WebElement seleccionacliente;
					
	@FindBy(name = "ctl00$maincontent$ProjectListGridViewRC$ctl03$PrInsert")
	WebElement seleccionaproyecto;

	@FindBy(name = "ctl00$maincontent$ProjectListGridViewRC$ctl03$ReqInsert")
	WebElement seleccionarq;
	
	@FindBy(name = "ctl00$maincontent$ProjectListGridViewRC$ctl03$CatInsert")
	WebElement seleccionacategoria;

	@FindBy(name = "ctl00$maincontent$ProjectListGridViewRC$ctl03$DescInsert")
	WebElement descripcion;

	@FindBy(name = "ctl00$maincontent$ProjectListGridViewRC$ctl03$MondayInsert")
	WebElement lunes;

	@FindBy(name = "ctl00$maincontent$ProjectListGridViewRC$ctl03$TuesdayInsert")
	WebElement martes;

	@FindBy(name = "ctl00$maincontent$ProjectListGridViewRC$ctl03$WednesdayInsert")
	WebElement miercoles;

	@FindBy(name = "ctl00$maincontent$ProjectListGridViewRC$ctl03$ThursdayInsert")
	WebElement jueves;

	@FindBy(name = "ctl00$maincontent$ProjectListGridViewRC$ctl03$btInsert")
	WebElement insertar;
	
	
	public void seleccionacliente(String cliente) {
		seleccionacliente.sendKeys(cliente);
		
	}
	public void seleccionaproyecto(String proyecto) {
		seleccionaproyecto.sendKeys(proyecto);
		//cajaTexto1.submit();
	}
	public void seleccionarq(String rq) {
		seleccionarq.sendKeys(rq);
		//cajaTexto1.submit();
	}
	public void seleccionacategoria(String categoria) {
		seleccionacategoria.sendKeys(categoria);
		//cajaTexto1.submit();
	}
	public void descripcion(String desc) {
		descripcion.sendKeys(desc);
		//cajaTexto1.submit();
	}
	public void lunes(String monday) {
		lunes.sendKeys(monday);
		//cajaTexto1.submit();
	}
	public void martes(String tuesday) {
		martes.sendKeys(tuesday);
		//cajaTexto1.submit();
	}
	public void miercoles(String wednesday) {
		miercoles.sendKeys(wednesday);
		//cajaTexto1.submit();
	}
	public void jueves(String thursday) {
		jueves.sendKeys(thursday);
		//cajaTexto1.submit();
	}
	public void insertar() {
		insertar.click();
	}

}
