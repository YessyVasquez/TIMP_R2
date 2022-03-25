package com.timp.test.BSC;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BSC.AcessarBSCPO;
import com.sap.timp.pageObjectModel.BSC.CorreçãodeNFRejeitarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CorreçãodeNFRejeitar extends TestBaseMassiel{

	LoginTC loginTC;
	AcessarBSCPO acessarBSC;
	AcessarBrbPO acessarBrbPO;
	CorreçãodeNFRejeitarPO  correçãodeNFRejeitarPO;

	@BeforeClass
	public void beforeClass() {	  
		driver = initializationM();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		correçãodeNFRejeitarPO = new CorreçãodeNFRejeitarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void  rejeitar() {
		loginTC.login();
		acessarBrbPO.acessar();

		ArrayList<Boolean> rejeitar =   correçãodeNFRejeitarPO.Rejeitar();
		for (int i = 0; i < rejeitar.size(); i++) {
			assertTrue(rejeitar.get(i), Filtros);
		}
	}
}
