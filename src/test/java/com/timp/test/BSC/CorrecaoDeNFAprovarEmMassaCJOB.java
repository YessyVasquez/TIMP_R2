package com.timp.test.BSC;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BSC.AcessarBSCPO;
import com.sap.timp.pageObjectModel.BSC.CorrecaoDeNFAprovarEmMassaCJOBPO;


import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CorrecaoDeNFAprovarEmMassaCJOB extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarBSCPO acessarBSC;
	AcessarBrbPO acessarBrbPO;
	CorrecaoDeNFAprovarEmMassaCJOBPO  correcaoDeNFAprovarEmMassaCJOBPO;


	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		correcaoDeNFAprovarEmMassaCJOBPO = new  CorrecaoDeNFAprovarEmMassaCJOBPO();
		acessarBSC = new  AcessarBSCPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void  Aprovar() {
		loginTC.login();
		acessarBrbPO.acessar();

		ArrayList<Boolean> viEdi =  correcaoDeNFAprovarEmMassaCJOBPO .enviar();
		for (int i = 0; i < viEdi.size(); i++) {
			assertTrue(viEdi.get(i), Filtros);
		}
	}
}
