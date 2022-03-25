package com.timp.test.MDR.DeXParaM010PlanodeContasSocietario;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeXParaM010PlanodeContasSocietario.DeXParaM010PlanodeContasSocietarioExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DeXParaM010PlanodeContasSocietarioExcluirEmMassa extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	DeXParaM010PlanodeContasSocietarioExcluirEmMassaPO deXParaM010PlanodeContasSocietarioExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		deXParaM010PlanodeContasSocietarioExcluirEmMassaPO = new DeXParaM010PlanodeContasSocietarioExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void criar() {
		
		loginTC.login();
		
		accesarMDR.acessarMDR();
		
		boolean sucesso = deXParaM010PlanodeContasSocietarioExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);


	}

	@Test(dependsOnMethods = "criar")
	public void excluirEmMassa() {

		boolean sucesso2 = deXParaM010PlanodeContasSocietarioExcluirEmMassaPO.deXParaM010ExcluirEmMassa();
		assertTrue(sucesso2, Eliminado);
	}

}
