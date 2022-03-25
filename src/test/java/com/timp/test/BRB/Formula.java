package com.timp.test.BRB;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.text.DecimalFormat;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.beust.jcommander.converters.FloatConverter;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.CriarCopiaPO;
import com.sap.timp.pageObjectModel.BRB.FormulaPO;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Valuable;
import net.bytebuddy.matcher.EqualityMatcher;

public class Formula extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	FormulaPO formulaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		formulaPO = new FormulaPO();

	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}



	@Test()
	public void formulaColuna() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();
		
		formulaPO.formulaColuna();

	}

	@Test(dependsOnMethods = "formulaColuna")
	public void formulaBoton() {

		formulaPO.formulaBoton();

	}

	@Test(dependsOnMethods = "formulaBoton")
	public void aplicar() {
		

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso = formulaPO.sucesso();
		System.out.println(sucesso);
		for (int i = 0; i < sucesso.size(); i++) {

			assertTrue(sucesso.get(i), "Numbers are not equal");
		}

	}

}
