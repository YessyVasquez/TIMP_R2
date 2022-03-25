package com.timp.test.MDR.TabelasApoioESocial.Tabela01;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela01.CategoriasDeTrabalhadoresExcluirPO;

public class CategoriasDeTrabalhadoresExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CategoriasDeTrabalhadoresExcluirPO categoriasDeTrabalhadoresExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		categoriasDeTrabalhadoresExcluirPO = new CategoriasDeTrabalhadoresExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = categoriasDeTrabalhadoresExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
