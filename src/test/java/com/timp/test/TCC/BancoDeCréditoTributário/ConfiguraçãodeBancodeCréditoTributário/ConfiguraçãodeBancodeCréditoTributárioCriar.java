package com.timp.test.TCC.BancoDeCréditoTributário.ConfiguraçãodeBancodeCréditoTributário;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCréditoTributário.ConfiguraçãodeBancodeCréditoTributário.ConfiguraçãodeBancodeCréditoTributárioCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguraçãodeBancodeCréditoTributárioCriar extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ConfiguraçãodeBancodeCréditoTributárioCriarPO configuraçãodeBancodeCréditoTributárioCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configuraçãodeBancodeCréditoTributárioCriarPO = new ConfiguraçãodeBancodeCréditoTributárioCriarPO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}


	@Test()
	public void criar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = configuraçãodeBancodeCréditoTributárioCriarPO.criar();
		assertTrue(sucesso, Criar);
	}

}
