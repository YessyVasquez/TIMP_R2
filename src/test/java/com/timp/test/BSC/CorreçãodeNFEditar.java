package com.timp.test.BSC;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BSC.AcessarBSCPO;
import com.sap.timp.pageObjectModel.BSC.CorreçãodeNFEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CorreçãodeNFEditar extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarBSCPO acessarBSC;
	AcessarBrbPO acessarBrbPO;
	CorreçãodeNFEditarPO correcaodeNFEditarPO;


	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		correcaodeNFEditarPO = new CorreçãodeNFEditarPO();
		acessarBSC = new  AcessarBSCPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void  executar() {
		loginTC.login();
		acessarBrbPO.acessar();

		ArrayList<Boolean> viEdi =  correcaodeNFEditarPO.Executar();
		for (int i = 0; i < viEdi.size(); i++) {
			assertTrue(viEdi.get(i), Filtros);
		}
	}
}
