package com.timp.test.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização.ConfiguraçãDeTipoTaxaDeAtualizaçãoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguraçãDeTipoTaxaDeAtualizaçãoEditar extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	ConfiguraçãDeTipoTaxaDeAtualizaçãoEditarPO configuraçãDeTipoTaxaDeAtualizaçãoEditarPO;

	public ConfiguraçãDeTipoTaxaDeAtualizaçãoEditar() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		configuraçãDeTipoTaxaDeAtualizaçãoEditarPO = new ConfiguraçãDeTipoTaxaDeAtualizaçãoEditarPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acesarMDRPO.acessarMDR();
		boolean sucesso = configuraçãDeTipoTaxaDeAtualizaçãoEditarPO.editar();
		assertTrue(sucesso, Editar);
	}
}
