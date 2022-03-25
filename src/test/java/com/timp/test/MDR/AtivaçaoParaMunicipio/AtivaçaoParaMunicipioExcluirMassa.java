package com.timp.test.MDR.AtivaçaoParaMunicipio;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtivaçaoParaMunicipio.AtivaçaoParaMunicipioExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AtivaçaoParaMunicipioExcluirMassa extends TestBaseSteven{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AtivaçaoParaMunicipioExcluirMassaPO ativaçaoParaMunicipioExcluirMassaPO;
	
  
  @BeforeClass
  public void beforeClass() {
	 driver = initialization();
	loginTC = new LoginTC();
	acessarMDRPO = new AcessarMDRPO();
	ativaçaoParaMunicipioExcluirMassaPO = new AtivaçaoParaMunicipioExcluirMassaPO();
  }

  @AfterClass
  public void afterClass() {
	 // driver.close();
  }

  @Test()
	public void ExcluirMassa() {

		loginTC.login();
		acessarMDRPO.acessarMDR();
		ativaçaoParaMunicipioExcluirMassaPO.ExcluirMassa();
		

	/*	boolean sucesso = ativaçaoParaMunicipioExcluirMassaPO.ExcluirMassa();
		assertTrue(sucesso, semAcesso);
		sleep(2000);*/
	}
}
