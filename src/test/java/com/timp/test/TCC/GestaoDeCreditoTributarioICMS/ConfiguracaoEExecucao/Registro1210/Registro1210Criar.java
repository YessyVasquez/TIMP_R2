package com.timp.test.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucao.Registro1210;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucao.Registro1210.Registro1210CriarPO;

public class Registro1210Criar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Registro1210CriarPO registro1210CriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationF();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		registro1210CriarPO = new Registro1210CriarPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}


	@Test()
	public void criar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = registro1210CriarPO.criar();
		assertTrue(sucesso, Criar);
	}
}
