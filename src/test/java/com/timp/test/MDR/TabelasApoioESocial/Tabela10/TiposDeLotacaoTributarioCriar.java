package com.timp.test.MDR.TabelasApoioESocial.Tabela10;

import org.testng.annotations.Test;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela10.TiposDeLotacaoTributariaCriarPO;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TiposDeLotacaoTributarioCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TiposDeLotacaoTributariaCriarPO tiposDeLotacaoTributariaCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tiposDeLotacaoTributariaCriarPO = new TiposDeLotacaoTributariaCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = tiposDeLotacaoTributariaCriarPO.criar();
		assertTrue(sucesso, Criar);
	}

}
