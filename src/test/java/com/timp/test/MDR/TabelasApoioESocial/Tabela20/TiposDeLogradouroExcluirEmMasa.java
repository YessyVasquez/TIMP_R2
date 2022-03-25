package com.timp.test.MDR.TabelasApoioESocial.Tabela20;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoExcluirMasaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela20.TiposDeLogradouroExcluirEmMasaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TiposDeLogradouroExcluirEmMasa extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	TiposDeLogradouroExcluirEmMasaPO tiposDeLogradouroExcluirEmMasaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		tiposDeLogradouroExcluirEmMasaPO = new TiposDeLogradouroExcluirEmMasaPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();
		accesarMDRPO.acessarMDR();

		boolean sucesso = tiposDeLogradouroExcluirEmMasaPO.criar();
		assertTrue(sucesso, Criar);

		sleep(1000);

	}

	@Test(dependsOnMethods = "criar")
	public void excluirEmMassa() {

		boolean sucesso2 = tiposDeLogradouroExcluirEmMasaPO.excluirMassa();
		assertTrue(sucesso2, Eliminado);

	}

}
