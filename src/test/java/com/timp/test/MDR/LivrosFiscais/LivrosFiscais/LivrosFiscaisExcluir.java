package com.timp.test.MDR.LivrosFiscais.LivrosFiscais;

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
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisExcluirPO;

public class LivrosFiscaisExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	LivrosFiscaisExcluirPO livrosFiscaisExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		livrosFiscaisExcluirPO = new LivrosFiscaisExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void excluir() {
		
		loginTC.login();
		
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = livrosFiscaisExcluirPO.excluir();

		assertTrue(sucesso, Eliminado);

	}
}
