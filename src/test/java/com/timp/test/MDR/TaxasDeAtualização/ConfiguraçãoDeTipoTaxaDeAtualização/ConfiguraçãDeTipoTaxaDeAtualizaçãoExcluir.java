package com.timp.test.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização.ConfiguraçãDeTipoTaxaDeAtualizaçãoExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguraçãDeTipoTaxaDeAtualizaçãoExcluir extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	ConfiguraçãDeTipoTaxaDeAtualizaçãoExcluirPO configuraçãDeTipoTaxaDeAtualizaçãoExcluirPO;

	public ConfiguraçãDeTipoTaxaDeAtualizaçãoExcluir() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		configuraçãDeTipoTaxaDeAtualizaçãoExcluirPO = new ConfiguraçãDeTipoTaxaDeAtualizaçãoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acesarMDRPO.acessarMDR();
		boolean sucesso = configuraçãDeTipoTaxaDeAtualizaçãoExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
	}
}
