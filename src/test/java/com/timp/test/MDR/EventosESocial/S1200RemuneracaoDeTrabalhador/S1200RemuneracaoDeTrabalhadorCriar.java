package com.timp.test.MDR.EventosESocial.S1200RemuneracaoDeTrabalhador;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1200RemuneracaoDeTrabalhador.S1200RemuneracaoDeTrabalhadorCriarPO;

public class S1200RemuneracaoDeTrabalhadorCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S1200RemuneracaoDeTrabalhadorCriarPO s1200RemuneracaoDeTrabalhadorCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s1200RemuneracaoDeTrabalhadorCriarPO = new S1200RemuneracaoDeTrabalhadorCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = s1200RemuneracaoDeTrabalhadorCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}
}
