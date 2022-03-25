package com.timp.test.TCC.BancoDeCréditoTributário.ConfiguraçãodeBancodeCréditoTributário;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCréditoTributário.ConfiguraçãodeBancodeCréditoTributário.ConfiguraçãodeBancodeCréditoTributárioEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguraçãodeBancodeCréditoTributárioEditar extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ConfiguraçãodeBancodeCréditoTributárioEditarPO configuraçãodeBancodeCréditoTributárioEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configuraçãodeBancodeCréditoTributárioEditarPO = new ConfiguraçãodeBancodeCréditoTributárioEditarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}
	
	@Test()
	public void editar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = configuraçãodeBancodeCréditoTributárioEditarPO.Editar();
		assertTrue(sucesso, Criar);
	}

}
