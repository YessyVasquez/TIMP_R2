package com.timp.test.MDR.TabelasApoioESocial.Tabela10;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela10.TiposDeLotacaoTributariaEditarPO;

import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TiposDeLotacaoTributarioEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TiposDeLotacaoTributariaEditarPO tiposDeLotacaoTributariaEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tiposDeLotacaoTributariaEditarPO = new TiposDeLotacaoTributariaEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = tiposDeLotacaoTributariaEditarPO.editar();
		assertTrue(sucesso, Editar);
	}

}
