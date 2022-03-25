package com.timp.test.MDR.TabelasApoioESocial.Tabela11;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela10.TiposDeLotacaoTributarioDetalhePO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela11.CompatibilidadeEnCatTrabDetalhePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CompatibilidadeEnCatTrabDetalhe extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	CompatibilidadeEnCatTrabDetalhePO compatibilidadeEnCatTrabDetalhePO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		compatibilidadeEnCatTrabDetalhePO = new CompatibilidadeEnCatTrabDetalhePO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

	@Test()
	public void detalhes() {

		loginTC.login();

		accesarMDR.acessarMDR();

		ArrayList<Boolean> sucesso = compatibilidadeEnCatTrabDetalhePO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}

}
