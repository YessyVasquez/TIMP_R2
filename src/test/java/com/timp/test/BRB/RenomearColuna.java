package com.timp.test.BRB;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.EditarPO;
import com.sap.timp.pageObjectModel.BRB.RenomearColunaPO;

public class RenomearColuna extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	RenomearColunaPO renomearColunaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		renomearColunaPO = new RenomearColunaPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void renomearColuna() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();


		ArrayList<String> sucesso = new ArrayList<String>();
		sucesso = renomearColunaPO.renomear();
		System.out.println(sucesso);
		assertEquals(sucesso.get(0), sucesso.get(1), renomear);

	}
}
