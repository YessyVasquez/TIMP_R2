package com.timp.test.BSC;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BSC.AcessarBSCPO;
import com.sap.timp.pageObjectModel.BSC.CorrecaoDeNFDetalhesPO;
import com.sap.timp.pageObjectModel.BSC.CorreçãodeNFVisualizarHistoricoPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CorreçãodeNFVisualizarHistorico extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarBSCPO acessarBSC;
	AcessarBrbPO acessarBrbPO;
	CorreçãodeNFVisualizarHistoricoPO correçãodeNFVisualizarHistoricoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		correçãodeNFVisualizarHistoricoPO = new CorreçãodeNFVisualizarHistoricoPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void  Aprovar() {


		ArrayList<Boolean> viEdi =   correçãodeNFVisualizarHistoricoPO.VisualizarHistorico();
		for (int i = 0; i < viEdi.size(); i++) {
			assertTrue(viEdi.get(i), Filtros);
		}
	}
}
