package com.timp.test.MDR.ConfiguracoesFundoSocial;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ConfiguracoesFundoSocial.ConfiguracoesFundoSocialFiltroIdPO;

public class ConfiguracaoFundoSocailFiltroId extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ConfiguracoesFundoSocialFiltroIdPO configuracoesFundoSocialFiltroIdPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		configuracoesFundoSocialFiltroIdPO = new ConfiguracoesFundoSocialFiltroIdPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void filtroId() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();


		boolean sucesso = configuracoesFundoSocialFiltroIdPO.filtro();

		assertTrue(sucesso, Filtros);

	}
}
