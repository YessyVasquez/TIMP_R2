package com.timp.test.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualizaçãoVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

@Test
public class ConfiguraçãoDeTipoTaxaDeAtualizaçãoVisualizar extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	ConfiguraçãoDeTipoTaxaDeAtualizaçãoVisualizarPO configuraçãoDeTipoTaxaDeAtualizaçãoVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		configuraçãoDeTipoTaxaDeAtualizaçãoVisualizarPO = new ConfiguraçãoDeTipoTaxaDeAtualizaçãoVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void visualizar() {
		loginTC.login();
		acesarMDRPO.acessarMDR();
		ArrayList<Boolean> sucesso = configuraçãoDeTipoTaxaDeAtualizaçãoVisualizarPO.Visualizar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}

	}

}
