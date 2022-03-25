package com.timp.test.MDR.EventosESocial.S1070ProcessosAdmJudiciais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1070ProcessosAdmJudiciais.S1070ProcessosAdmJudiciaisExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class S1070ProcessosAdmJudiciaisExluir extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	S1070ProcessosAdmJudiciaisExcluirPO s1070ProcessosAdmJudiciaisExcluirPO;
	
	public S1070ProcessosAdmJudiciaisExluir() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		s1070ProcessosAdmJudiciaisExcluirPO = new S1070ProcessosAdmJudiciaisExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void excluir() {
		loginTC.login();
		acesarMDRPO.acessarMDR();
		boolean sucesso = s1070ProcessosAdmJudiciaisExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
	}
}
