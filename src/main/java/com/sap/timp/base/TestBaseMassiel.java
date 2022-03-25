
package com.sap.timp.base;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.prefs.Preferences;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;

public class TestBaseMassiel extends TestBaseSteven {

	TestBaseSteven testeBaseSteven = new TestBaseSteven();

	public WebDriver initializationM() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");

		
		//Evita que el mensaje de "Chorme siendo controlado por un software de automatizacion" aprezca
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
		
		//Evita que la ventana de guardar contraseña aparezca
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);
		
		//options.addArguments("--headless");
        
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(tc2);

	    return driver;
	}
	//PARA PODER EJECUTAR TA-518
	public String dataanterior() {
		
		DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.add (Calendar.DAY_OF_MONTH, -1);
		
		return df.format(cal.getTime());
		
	}
	
	public String diaHoy() {
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = new GregorianCalendar();
		
		String dia = Integer.toString(c2.get(Calendar.DATE));
		

		return dia;

	}
	
	public String diaDespues() {
		
		DateFormat df = new SimpleDateFormat ("d");
		Calendar cal = Calendar.getInstance();
		cal.add (Calendar.DATE, +1);
		
		return df.format(cal.getTime());
	}
	
	public String diaActual() {
		
		// Obtienes el mes actual
		int anio = LocalDate.now().getDayOfMonth();
		
		String anioString = String.valueOf(anio);
		return anioString;
	}
	
	
	public void closeSelectTypeCheckbox(WebElement element) {
		new Actions(driver).moveToElement(element).click().perform();
	}
	
	public String anioActual() {
		// Obtienes el mes actual
		int anio = LocalDate.now().getYear();
		
		String anioString = String.valueOf(anio);
		return anioString;
	}
	
	public String capitalize(String cadena) {
		String[] split = cadena.split("");
        for (int i = 0; i < split.length; i++) {
            if(i == 0 || split[i-1].equals(" ")) {
                split[i] = split[i].toUpperCase();
            }
        }
        
        return String.join("", split);
	}
	
	public String mesActual() {
		// Obtienes el mes actual
		Month mes = LocalDate.now().getMonth();

		// Obtienes el nombre del mes
		String nombreMes = mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
		nombreMes = capitalize(nombreMes);
		
		return nombreMes;
	}
	
	public void idInserir5(String idRegistro) {

		Preferences id = Preferences.userRoot();

		id.put("idR5", idRegistro);

	}

	public String idObter5() {

		Preferences id = Preferences.userRoot();

		long idRegistro = id.getLong("idR5", 1);

		String idReturn = String.valueOf(idRegistro);

		return idReturn;

	}
	
	public void idInserir6(String idRegistro) {

		Preferences id = Preferences.userRoot();

		id.put("idR6", idRegistro);

	}

	public String idObter6() {

		Preferences id = Preferences.userRoot();

		long idRegistro = id.getLong("idR6", 1);

		String idReturn = String.valueOf(idRegistro);

		return idReturn;

	}
	
	public void idInserir7(String idRegistro) {

		Preferences id = Preferences.userRoot();

		id.put("idR7", idRegistro);

	}

	public String idObter7() {

		Preferences id = Preferences.userRoot();

		long idRegistro = id.getLong("idR7", 1);

		String idReturn = String.valueOf(idRegistro);

		return idReturn;

	}
	
	public void idInserir8(String idRegistro) {

		Preferences id = Preferences.userRoot();

		id.put("idR8", idRegistro);

	}

	public String idObter8() {

		Preferences id = Preferences.userRoot();

		long idRegistro = id.getLong("idR8", 1);

		String idReturn = String.valueOf(idRegistro);

		return idReturn;

	}

	public void idInserir9(String idRegistro) {

		Preferences id = Preferences.userRoot();

		id.put("idR9", idRegistro);

	}

	public String idObter9() {

		Preferences id = Preferences.userRoot();

		long idRegistro = id.getLong("idR9", 1);

		String idReturn = String.valueOf(idRegistro);

		return idReturn;

	}
	
	public void idInserir10(String idRegistro) {

		Preferences id = Preferences.userRoot();

		id.put("idR10", idRegistro);

	}

	public String idObter10() {

		Preferences id = Preferences.userRoot();

		long idRegistro = id.getLong("idR10", 1);

		String idReturn = String.valueOf(idRegistro);

		return idReturn;

	}
	
	public void idInserir11(String idRegistro) {

		Preferences id = Preferences.userRoot();

		id.put("idR11", idRegistro);

	}

	public String idObter11() {

		Preferences id = Preferences.userRoot();

		long idRegistro = id.getLong("idR11", 1);

		String idReturn = String.valueOf(idRegistro);

		return idReturn;

	}
	
	public String fechaPasadoManana() {

		Date fecha = new Date();

		Date ayer = new Date(fecha.getTime() + TimeUnit.DAYS.toMillis(+2));

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY");

		return df.format(ayer);

	}
	
	public static boolean validarFecha(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
	
}


	


