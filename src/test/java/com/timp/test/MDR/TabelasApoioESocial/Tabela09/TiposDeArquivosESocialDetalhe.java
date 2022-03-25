package com.timp.test.MDR.TabelasApoioESocial.Tabela09;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela08.ClassificacaoTributariaDetalhePO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela09.TiposDeArquivosESocialDetalhePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class TiposDeArquivosESocialDetalhe extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	TiposDeArquivosESocialDetalhePO tiposDeArquivosESocialDetalhePO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		tiposDeArquivosESocialDetalhePO = new TiposDeArquivosESocialDetalhePO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

	@Test()
	public void detalhes() {

		loginTC.login();

		accesarMDR.acessarMDR();

		ArrayList<Boolean> sucesso = tiposDeArquivosESocialDetalhePO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}
}
