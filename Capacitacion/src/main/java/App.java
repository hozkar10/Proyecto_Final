import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Capacitacion_Page.VistaHomeChronus;
import Capacitacion_Page.VistaHomeChronus2;
import Capacitacion_Page.VistaHomeMercadoLibre;

public class App {
	public static void main(String[] args) {
		
	App app = new App();
	app.clase11MercadoLibre();
				
	}

	
public void clase11MercadoLibre() {
		
		Driver objDriver = new Driver();
		objDriver.lanzarNavegador("google");
		objDriver.navegarA("https://services.sophossolutions.com/TimeTracker/TimeTracker/Login.aspx?ReturnUrl=%2fTimeTracker%2fdefault.aspx");
		VistaHomeChronus objVistaHome = new VistaHomeChronus(objDriver.getDriver());
		objVistaHome.setTexto1("oscar.garciar");
		objVistaHome.setTexto2("ATHagosto.10");
		objVistaHome.iniciar_sesion();
		
		VistaHomeChronus2 objVistaHome2 = new VistaHomeChronus2(objDriver.getDriver());
		objVistaHome2.seleccionacliente("ATH");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		objVistaHome2.seleccionaproyecto("SBAT");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		objVistaHome2.seleccionarq("RQ");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		objVistaHome2.seleccionacategoria("Ejecucion");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		objVistaHome2.descripcion("Proyecto Final");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		objVistaHome2.lunes("9");
		objVistaHome2.martes("9");
		objVistaHome2.miercoles("9");
		objVistaHome2.jueves("9");
		
		objVistaHome2.insertar();
		
	
		
		
		/*VistaResultados objResultados = new VistaResultados(objDriver.getDriver());
		if(objResultados.darClickPrimerResultado()) {
			System.out.println("El elemento exite");
		}else {
			System.out.println("El elemento que desea buscar no existe");
		}*/
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//objDriver.cierreNavegador();
	}

}
