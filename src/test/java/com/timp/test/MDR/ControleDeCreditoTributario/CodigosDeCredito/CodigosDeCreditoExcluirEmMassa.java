package com.timp.test.MDR.ControleDeCreditoTributario.CodigosDeCredito;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.CodigosDeCredito.CodigosDeCreditoExcluirEmMassaPO;

public class CodigosDeCreditoExcluirEmMassa extends TestBaseSteven {
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigosDeCreditoExcluirEmMassaPO codigosDeCreditoExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigosDeCreditoExcluirEmMassaPO = new CodigosDeCreditoExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	

	@Test()
	public void criar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = codigosDeCreditoExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);


	}
	
	@Test(dependsOnMethods = "criar")
	public void excluir() {
		
		boolean sucesso2 = codigosDeCreditoExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}
 
}
