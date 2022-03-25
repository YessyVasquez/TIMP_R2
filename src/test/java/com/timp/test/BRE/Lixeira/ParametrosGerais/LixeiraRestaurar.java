package com.timp.test.BRE.Lixeira.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.Lixeira.ParametrosGerais.LixeiraRestaurarPO;

public class LixeiraRestaurar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	LixeiraRestaurarPO lixeiraRestaurarPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		lixeiraRestaurarPO = new LixeiraRestaurarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	
	@Test()
	public void restaurar() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		boolean sucesso = lixeiraRestaurarPO.restaurar();
		assertTrue(sucesso, Restaurar);
		sleep(2000);
	} 
}
