package com.timp.test.MDR.HierarquiaDeCenariosDeCorreçao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.HierarquiaDeCenariosDeCorreçao.HierarquiaDeCenariosDeCorreçaoExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class HierarquiaDeCenariosDeCorreçaoExcluir extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	HierarquiaDeCenariosDeCorreçaoExcluirPO hierarquiaDeCenariosDeCorreçaoExcluirPO;
	
  @BeforeClass
  public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		hierarquiaDeCenariosDeCorreçaoExcluirPO = new HierarquiaDeCenariosDeCorreçaoExcluirPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  
  @Test()
	public void excluir() {

		loginTC.login();

		acessarMDRPO.acessarMDR();
		
		
		boolean sucesso = hierarquiaDeCenariosDeCorreçaoExcluirPO.Excluir();
		assertTrue(sucesso, semAcesso);

	}

}
