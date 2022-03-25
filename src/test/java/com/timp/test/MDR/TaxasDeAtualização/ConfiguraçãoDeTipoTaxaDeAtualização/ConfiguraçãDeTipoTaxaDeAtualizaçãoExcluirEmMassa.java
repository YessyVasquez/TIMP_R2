package com.timp.test.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização.ConfiguraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassa extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	ConfiguraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassaPO configuraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		configuraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassaPO = new ConfiguraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		accesarMDR.acessarMDR();
		boolean sucesso = configuraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);

	}

	@Test(dependsOnMethods = "criar")
	public void excluirEmMassa() {

		boolean sucesso2 = configuraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassaPO
				.configuraçãDeTipoTaxaDeAtualizaçãoExcluirEmMassa();
		assertTrue(sucesso2, Eliminado);
	}

}
