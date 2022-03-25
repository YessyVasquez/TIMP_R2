package com.timp.test.BSC;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BSC.AcessarBSCPO;
import com.sap.timp.pageObjectModel.BSC.CorrecaoDeNFDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CorrecaoDeNFDetalhes extends TestBaseMassiel{

	LoginTC loginTC;
	AcessarBSCPO acessarBSC;
	CorrecaoDeNFDetalhesPO correcaoDeNFDetalhesPO;
	AcessarBrbPO acessarBrbPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		correcaoDeNFDetalhesPO = new CorrecaoDeNFDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void  Aprovar() {
		loginTC.login();
		acessarBrbPO.acessar();

		ArrayList<Boolean> viEdi =   correcaoDeNFDetalhesPO.Detalhes();
		for (int i = 0; i < viEdi.size(); i++) {
			assertTrue(viEdi.get(i), Filtros);
		}
	}
}
