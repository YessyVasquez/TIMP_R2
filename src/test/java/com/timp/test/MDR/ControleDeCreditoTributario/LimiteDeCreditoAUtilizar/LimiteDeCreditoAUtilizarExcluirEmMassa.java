package com.timp.test.MDR.ControleDeCreditoTributario.LimiteDeCreditoAUtilizar;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.LimiteDeCreditoAUtilizar.LimiteDeCreditoAUtilizarExcluirEmMassaPO;
import com.sap.timp.pageObjectModel.MDR.OcorrenciaFiscal.StatusOcorrenciaFiscal.StatusOcorrenciaFiscalExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class LimiteDeCreditoAUtilizarExcluirEmMassa extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	LimiteDeCreditoAUtilizarExcluirEmMassaPO limiteDeCreditoAUtilizarExcluirEmMassaPO;
	
     @BeforeClass
	  public void beforeClass() {
	
			driver = initializationKen();
			loginTC = new LoginTC();
			acessarMDRPO = new AcessarMDRPO();
			limiteDeCreditoAUtilizarExcluirEmMassaPO = new LimiteDeCreditoAUtilizarExcluirEmMassaPO();
	  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }


	@Test()
	public void criar() {

		loginTC.login();
		
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = limiteDeCreditoAUtilizarExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
	}
	
	@Test(dependsOnMethods = "criar")
	public void excluir() {
		
		boolean sucesso2 = limiteDeCreditoAUtilizarExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}


}
