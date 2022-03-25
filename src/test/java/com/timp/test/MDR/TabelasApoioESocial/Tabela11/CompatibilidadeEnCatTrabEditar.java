package com.timp.test.MDR.TabelasApoioESocial.Tabela11;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela01.CategoriasDeTrabalhadoresEditarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela11.CompatibilidadeEnCatTrabEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CompatibilidadeEnCatTrabEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CompatibilidadeEnCatTrabEditarPO compatibilidadeEnCatTrabEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		compatibilidadeEnCatTrabEditarPO = new CompatibilidadeEnCatTrabEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = compatibilidadeEnCatTrabEditarPO.editar();
		assertTrue(sucesso, Editar);
	}

}
