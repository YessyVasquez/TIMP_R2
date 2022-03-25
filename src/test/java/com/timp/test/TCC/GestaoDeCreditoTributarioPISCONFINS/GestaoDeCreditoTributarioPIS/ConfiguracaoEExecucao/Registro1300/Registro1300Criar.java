package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.Registro1300;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.Registro1300.Registro1300CriarPO;

public class Registro1300Criar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Registro1300CriarPO registro1300CriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		registro1300CriarPO = new Registro1300CriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void criar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = registro1300CriarPO.criar();

		assertTrue(sucesso, Criar);
	}
}
