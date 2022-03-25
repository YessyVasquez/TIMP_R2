package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.PainelCredito.ConfiguraçãoeExecução;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.PainelCredito.ConfiguraçãoeExecução.ConfiguraçãoeExecuçãoExecutarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguraçãoeExecuçãoExecutar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ConfiguraçãoeExecuçãoExecutarPO configuraçãoeExecuçãoExecutarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configuraçãoeExecuçãoExecutarPO = new ConfiguraçãoeExecuçãoExecutarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void executar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = configuraçãoeExecuçãoExecutarPO.executar();
		assertTrue(sucesso, "executar");
	}

}
