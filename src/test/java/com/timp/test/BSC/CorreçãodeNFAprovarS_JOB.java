package com.timp.test.BSC;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BSC.AcessarBSCPO;
import com.sap.timp.pageObjectModel.BSC.CorrecaoDeNFAprovarEmMassaCJOBPO;
import com.sap.timp.pageObjectModel.BSC.CorreçãodeNFAprovarS_JOBPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CorreçãodeNFAprovarS_JOB extends TestBaseSteven{
	LoginTC loginTC;
	AcessarBSCPO acessarBSC;
	AcessarBrbPO acessarBrbPO;
	CorreçãodeNFAprovarS_JOBPO  correçãodeNFAprovarS_JOBPO;


	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		correçãodeNFAprovarS_JOBPO = new  CorreçãodeNFAprovarS_JOBPO();
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

		ArrayList<Boolean> viEdi =  correçãodeNFAprovarS_JOBPO .enviar();
		for (int i = 0; i < viEdi.size(); i++) {
			assertTrue(viEdi.get(i), Filtros);
		}
	}
}
