package com.timp.test.MDR.CEP.Logradouro;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CEP.Logradouro.LogradouroEditarPO;

public class LogradouroEditar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	LogradouroEditarPO logradouroEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		logradouroEditarPO = new LogradouroEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void editar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();
		
		boolean sucesso = logradouroEditarPO.logradouroEditar();
		assertTrue(sucesso, Editar);
		sleep(2000);
	}
}
