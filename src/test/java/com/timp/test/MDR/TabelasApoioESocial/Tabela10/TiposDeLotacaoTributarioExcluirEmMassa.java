package com.timp.test.MDR.TabelasApoioESocial.Tabela10;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela10.TiposDeLotacaoTributariaExcluirEmMassaPO;

public class TiposDeLotacaoTributarioExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TiposDeLotacaoTributariaExcluirEmMassaPO tiposDeLotacaoTributariaExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tiposDeLotacaoTributariaExcluirEmMassaPO = new TiposDeLotacaoTributariaExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = tiposDeLotacaoTributariaExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
	}

	@Test(dependsOnMethods = "criar")
	public void excluirEmMassa() {
		boolean sucesso2 = tiposDeLotacaoTributariaExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}
