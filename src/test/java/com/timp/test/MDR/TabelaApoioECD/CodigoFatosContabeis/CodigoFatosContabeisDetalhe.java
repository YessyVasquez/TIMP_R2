package com.timp.test.MDR.TabelaApoioECD.CodigoFatosContabeis;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.CodigoFatosContabeis.CodigoFatosContabeisDetalhePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CodigoFatosContabeisDetalhe extends TestBaseFernando {

	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	CodigoFatosContabeisDetalhePO codigoFatosContabeisDetalhePO;

	public CodigoFatosContabeisDetalhe() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		codigoFatosContabeisDetalhePO = new CodigoFatosContabeisDetalhePO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void detalhe() {
		loginTC.login();
		acesarMDRPO.acessarMDR();
		ArrayList<Boolean> sucesso = codigoFatosContabeisDetalhePO.detalheCodigoFatosContabeisDetalhe();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}
}
