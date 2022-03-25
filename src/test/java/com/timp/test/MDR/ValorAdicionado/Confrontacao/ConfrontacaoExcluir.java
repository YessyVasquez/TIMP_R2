package com.timp.test.MDR.ValorAdicionado.Confrontacao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ValorAdicionado.Confrontacao.ConfrontacaoExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfrontacaoExcluir extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	ConfrontacaoExcluirPO confrontacaoExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		accesarMDRPO = new AcessarMDRPO();
		loginTC = new LoginTC();
		confrontacaoExcluirPO = new ConfrontacaoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void Excluir() {

		loginTC.login();
		accesarMDRPO.acessarMDR();

		boolean sucesso = confrontacaoExcluirPO.Excluir();
		assertTrue(sucesso, Editar);
	}
}
