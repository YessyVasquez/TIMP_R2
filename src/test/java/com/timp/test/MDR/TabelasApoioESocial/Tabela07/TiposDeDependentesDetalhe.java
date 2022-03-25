package com.timp.test.MDR.TabelasApoioESocial.Tabela07;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela06.PaisesDetalhePO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela07.TiposDeDependentesDetalhePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class TiposDeDependentesDetalhe extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	TiposDeDependentesDetalhePO tiposDeDependentesDetalhePO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		tiposDeDependentesDetalhePO = new TiposDeDependentesDetalhePO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

	@Test()
	public void detalhes() {

		loginTC.login();

		accesarMDR.acessarMDR();

		ArrayList<Boolean> sucesso = tiposDeDependentesDetalhePO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}
}
