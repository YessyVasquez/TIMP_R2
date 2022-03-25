package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.RegistroM225;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.RegistroM225.RegistroM225CriarO;

public class RegistroM225Criar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	RegistroM225CriarO registroM225PCriarO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		registroM225PCriarO = new RegistroM225CriarO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();

		acessarTCCPO.acessarTCC();

		boolean sucesso = registroM225PCriarO.criar();

		assertTrue(sucesso, Criar);
	}

}
