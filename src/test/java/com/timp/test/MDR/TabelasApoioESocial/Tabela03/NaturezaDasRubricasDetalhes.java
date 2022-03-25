package com.timp.test.MDR.TabelasApoioESocial.Tabela03;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela03.NaturezaDasRubricasDetalhesPO;

public class NaturezaDasRubricasDetalhes extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	NaturezaDasRubricasDetalhesPO naturezaDasRubricasDetalhesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		naturezaDasRubricasDetalhesPO = new NaturezaDasRubricasDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void detalhe() {
		loginTC.login();
		accesarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = naturezaDasRubricasDetalhesPO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}
}
