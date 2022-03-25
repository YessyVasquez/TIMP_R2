package com.timp.test.MDR.PrecoDeTransferencia.DefinicaoVinculacao;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.DefinicaoVinculacao.DefinicaoVinculacaoFiltroIDPO;


public class DefinicaoVinculacaoFiltroID extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DefinicaoVinculacaoFiltroIDPO definicaoVinculacaoFiltroIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		definicaoVinculacaoFiltroIDPO = new DefinicaoVinculacaoFiltroIDPO();

	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}
	/*
	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}*/

	@Test()
	public void filtro() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = definicaoVinculacaoFiltroIDPO.filtro();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}

	}
}
