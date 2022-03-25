package com.timp.test.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucao.Registro1210;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucao.Registro1210.Registro1210EditarPO;

public class Registro1210Editar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Registro1210EditarPO registro1210EditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationF();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		registro1210EditarPO = new Registro1210EditarPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}


	@Test()
	public void editar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = registro1210EditarPO.editar();
		assertTrue(sucesso, Criar);
	}
}
