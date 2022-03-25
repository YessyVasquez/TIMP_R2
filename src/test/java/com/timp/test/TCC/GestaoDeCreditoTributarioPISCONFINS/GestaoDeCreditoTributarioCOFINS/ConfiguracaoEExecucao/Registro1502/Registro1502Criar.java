package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.Registro1502;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.Registro1502.Registro1502CriarPO;

public class Registro1502Criar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Registro1502CriarPO registro1502CriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		registro1502CriarPO = new Registro1502CriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = registro1502CriarPO.criar();

		assertTrue(sucesso, Criar);
	}
}
