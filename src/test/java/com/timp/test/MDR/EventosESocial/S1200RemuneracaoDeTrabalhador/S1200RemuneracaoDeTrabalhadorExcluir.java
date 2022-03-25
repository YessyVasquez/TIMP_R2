package com.timp.test.MDR.EventosESocial.S1200RemuneracaoDeTrabalhador;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1200RemuneracaoDeTrabalhador.S1200RemuneracaoDeTrabalhadorExcluirPO;

public class S1200RemuneracaoDeTrabalhadorExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S1200RemuneracaoDeTrabalhadorExcluirPO s1200RemuneracaoDeTrabalhadorExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s1200RemuneracaoDeTrabalhadorExcluirPO = new S1200RemuneracaoDeTrabalhadorExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = s1200RemuneracaoDeTrabalhadorExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
