package com.timp.test.MDR.CadastroDerex.CadastroResponsavel;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroDerex.CadastroResponsavel.ResponsavelMovimientoExcluirMasasPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ResponsavelMovimientoExcluirMasas extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ResponsavelMovimientoExcluirMasasPO responsavelMovimientoExcluirMasasPO;

  @BeforeClass
  public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		responsavelMovimientoExcluirMasasPO = new ResponsavelMovimientoExcluirMasasPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  

	@Test(priority = 2)
	public void criar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();
		
		boolean sucesso =responsavelMovimientoExcluirMasasPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);
		

	}
	
	@Test(dependsOnMethods = "criar")
	public void excluir() {
		
		boolean sucesso2 = responsavelMovimientoExcluirMasasPO.ResponsavelMovimientoExcluirMasas();
		assertTrue(sucesso2, Eliminado);
		sleep(2000);
	}


}
