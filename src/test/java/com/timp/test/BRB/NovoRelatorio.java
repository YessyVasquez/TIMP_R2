package com.timp.test.BRB;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import javax.swing.text.html.HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.NovoRelatorioPO;

public class NovoRelatorio extends TestBaseSteven {

	LoginTC loginTc;
	AcessarBrbPO accesarBrbPO;
	NovoRelatorioPO novoRelatorioPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTc = new LoginTC();
		accesarBrbPO = new AcessarBrbPO();
		novoRelatorioPO = new NovoRelatorioPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}

	@Test()
	public void novoRelatorio() {
		
		loginTc.login();
		
		accesarBrbPO.acessar();
		sleep(4000);

		boolean sucesso = novoRelatorioPO.criar();
		sleep(4000);
		assertTrue(sucesso, Criar);
		sleep(2000);
	}


}
