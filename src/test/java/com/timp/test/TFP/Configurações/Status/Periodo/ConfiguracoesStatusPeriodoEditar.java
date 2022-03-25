package com.timp.test.TFP.Configurações.Status.Periodo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configurações.Status.Periodo.ConfiguracoesStatusPeriodoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConfiguracoesStatusPeriodoEditar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	ConfiguracoesStatusPeriodoEditarPO configuracoesStatusPeriodoEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		configuracoesStatusPeriodoEditarPO = new ConfiguracoesStatusPeriodoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void editar() {
		
		loginTC.login();
		acessarTFPPO.acessarTFP();

		ArrayList<Boolean> sucesso = configuracoesStatusPeriodoEditarPO.editar();
		for (int i = 0; i < sucesso.size(); i++) {
			// teste pra conferir se o resultado mostrado é igual
			assertTrue(sucesso.get(i), Editar);
		}

	}
}
