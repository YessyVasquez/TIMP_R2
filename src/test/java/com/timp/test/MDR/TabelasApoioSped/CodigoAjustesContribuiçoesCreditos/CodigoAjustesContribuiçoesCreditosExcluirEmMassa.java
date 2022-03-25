package com.timp.test.MDR.TabelasApoioSped.CodigoAjustesContribuiçoesCreditos;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoAjustesContribuiçoesCreditos.CodigoAjustesContribuiçoesCreditosExcluirEmMassaPO;

public class CodigoAjustesContribuiçoesCreditosExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoAjustesContribuiçoesCreditosExcluirEmMassaPO codigoAjustesContribuiçoesCreditosExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization(); 
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoAjustesContribuiçoesCreditosExcluirEmMassaPO = new CodigoAjustesContribuiçoesCreditosExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = codigoAjustesContribuiçoesCreditosExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
	}
	
	@Test(dependsOnMethods = "criar")
	public void excluirEmMassa() {
		boolean sucesso2 = codigoAjustesContribuiçoesCreditosExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);
	}

}
