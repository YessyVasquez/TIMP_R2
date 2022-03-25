package com.timp.test.MDR.TabelasApoioESocial.UnidadeDeMedida;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoExcluirMasaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela20.TiposDeLogradouroExcluirEmMasaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.UnidadeDeMedida.UnidadeDeMedidaExcluirEmMasaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class UnidadeDeMedidaExcluirEmMasa extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	UnidadeDeMedidaExcluirEmMasaPO unidadeDeMedidaExcluirEmMasaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		unidadeDeMedidaExcluirEmMasaPO = new UnidadeDeMedidaExcluirEmMasaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = unidadeDeMedidaExcluirEmMasaPO.criar();
		assertTrue(sucesso, Criar);

	}

	@Test(dependsOnMethods = "criar")
	public void excluir() {
		boolean sucesso2 = unidadeDeMedidaExcluirEmMasaPO.excluirMassa();
		assertTrue(sucesso2, Eliminado);
	}

}
