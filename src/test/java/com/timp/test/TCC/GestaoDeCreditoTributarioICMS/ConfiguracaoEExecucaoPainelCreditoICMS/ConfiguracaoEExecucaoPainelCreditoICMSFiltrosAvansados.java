package com.timp.test.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucaoPainelCreditoICMS;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucaoPainelCreditoICMS.ConfiguracaoEExecucaoPainelCreditoICMSFiltrosAvansadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConfiguracaoEExecucaoPainelCreditoICMSFiltrosAvansados extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ConfiguracaoEExecucaoPainelCreditoICMSFiltrosAvansadosPO configuracaoEExecucaoPainelCreditoICMSFiltrosAvansadosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configuracaoEExecucaoPainelCreditoICMSFiltrosAvansadosPO = new ConfiguracaoEExecucaoPainelCreditoICMSFiltrosAvansadosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtros() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		

		configuracaoEExecucaoPainelCreditoICMSFiltrosAvansadosPO.Filtros();

		ArrayList<Boolean> sucesso = configuracaoEExecucaoPainelCreditoICMSFiltrosAvansadosPO.Empresa();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}

		ArrayList<Boolean> Filial = configuracaoEExecucaoPainelCreditoICMSFiltrosAvansadosPO.Filial();

		for (int i = 0; i < Filial.size(); i++) {
			assertTrue(Filial.get(i), visualizaçar);
		}
	}
}
