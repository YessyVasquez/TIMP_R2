package com.timp.test.MDR.ConfiguracoesFundoSocial;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ConfiguracoesFundoSocial.ConfiguracoesFundoSocialEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguracoesFundoSocialEditar extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	ConfiguracoesFundoSocialEditarPO configuracoesFundoSocialEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		accesarMDRPO = new AcessarMDRPO();
		loginTC = new LoginTC();
		configuracoesFundoSocialEditarPO = new ConfiguracoesFundoSocialEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {

		loginTC.login();

		accesarMDRPO.acessarMDR();

		boolean sucesso = configuracoesFundoSocialEditarPO.Editar();
		assertTrue(sucesso, Editar);

	}

}
