package com.timp.test.MDR.Siscoserv.RegistroRF;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CEP.Bairro.BairroCriarPO;
import com.sap.timp.pageObjectModel.MDR.LimiteCompetencia.LimiteCompetenciaCriarPO;
import com.sap.timp.pageObjectModel.MDR.LimiteCompetencia.LimiteCompetenciaEditarPO;
import com.sap.timp.pageObjectModel.MDR.LimiteCompetencia.LimiteCompetenciaExcluirPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRF.RegistroRFExcluirPO;

public class RegistroRFExcluir extends TestBaseSteven {
 
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RegistroRFExcluirPO registroRFExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		registroRFExcluirPO = new RegistroRFExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()

	public void excluir() {

		
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = registroRFExcluirPO.excluir();

		assertTrue(sucesso, editado);

	}
}
