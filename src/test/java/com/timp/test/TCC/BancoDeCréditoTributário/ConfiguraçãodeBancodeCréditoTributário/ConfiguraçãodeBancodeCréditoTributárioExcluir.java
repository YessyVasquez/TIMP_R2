package com.timp.test.TCC.BancoDeCréditoTributário.ConfiguraçãodeBancodeCréditoTributário;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCréditoTributário.ConfiguraçãodeBancodeCréditoTributário.ConfiguraçãodeBancodeCréditoTributárioExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguraçãodeBancodeCréditoTributárioExcluir extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ConfiguraçãodeBancodeCréditoTributárioExcluirPO configuraçãodeBancodeCréditoTributárioExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configuraçãodeBancodeCréditoTributárioExcluirPO = new ConfiguraçãodeBancodeCréditoTributárioExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso2 = configuraçãodeBancodeCréditoTributárioExcluirPO.excluir();
		assertTrue(sucesso2, Eliminado);
	}

}
