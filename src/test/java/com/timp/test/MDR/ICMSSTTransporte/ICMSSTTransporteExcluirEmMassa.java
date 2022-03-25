package com.timp.test.MDR.ICMSSTTransporte;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ICMSSTTransporte.ICMSSTTransporteExcluirEmMassaPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ICMSSTTransporteExcluirEmMassa extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	ICMSSTTransporteExcluirEmMassaPO iCMSSTTransporteExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		iCMSSTTransporteExcluirEmMassaPO = new ICMSSTTransporteExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();

		accesarMDR.acessarMDR();

		boolean sucesso = iCMSSTTransporteExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);

	}

	@Test(dependsOnMethods = "criar")
	public void excluir() {

		boolean sucesso2 = iCMSSTTransporteExcluirEmMassaPO.iCMSSTTransporteExcluirEmMassa();
		assertTrue(sucesso2, Eliminado);
	}

}
