package com.timp.test.MDR.ConfiguracoesFundoSocial;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ConfiguracoesFundoSocial.ConfiguracoesFundoSocialExcluirPO;

public class ConfiguracoesFundoSocialExcluir extends TestBaseSteven {
  
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ConfiguracoesFundoSocialExcluirPO configuracoesFundoSocialExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		configuracoesFundoSocialExcluirPO = new ConfiguracoesFundoSocialExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void excluir() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = configuracoesFundoSocialExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
		

	}
	
}
