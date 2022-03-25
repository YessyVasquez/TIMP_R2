package com.timp.test.BRB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AcessarBRB extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void brbEntrar() {
		
		loginTC.login();

		boolean sucesso = acessarBrbPO.acessar();
		System.out.println(sucesso);

		assertTrue(sucesso, semAcesso);
		sleep(2000);
	}

}
