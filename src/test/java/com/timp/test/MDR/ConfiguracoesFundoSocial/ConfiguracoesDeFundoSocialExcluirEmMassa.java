package com.timp.test.MDR.ConfiguracoesFundoSocial;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ConfiguracoesFundoSocial.ConfiguracoesDeFundoSocialExcluirEmMassaPO;

public class ConfiguracoesDeFundoSocialExcluirEmMassa extends TestBaseSteven{

	
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ConfiguracoesDeFundoSocialExcluirEmMassaPO configuracoesDeFundoSocialExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		configuracoesDeFundoSocialExcluirEmMassaPO = new ConfiguracoesDeFundoSocialExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	
	@Test()
	public void criar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();


		boolean sucesso =  configuracoesDeFundoSocialExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);


	}

	
	@Test(dependsOnMethods = "criar")
	public void excluir() {

		boolean sucesso2 = configuracoesDeFundoSocialExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}
