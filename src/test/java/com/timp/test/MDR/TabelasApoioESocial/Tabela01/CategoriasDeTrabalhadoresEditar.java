package com.timp.test.MDR.TabelasApoioESocial.Tabela01;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela01.CategoriasDeTrabalhadoresEditarPO;

public class CategoriasDeTrabalhadoresEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CategoriasDeTrabalhadoresEditarPO categoriasDeTrabalhadoresEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		categoriasDeTrabalhadoresEditarPO = new CategoriasDeTrabalhadoresEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = categoriasDeTrabalhadoresEditarPO.editar();

		assertTrue(sucesso, Editar);

	}
}
