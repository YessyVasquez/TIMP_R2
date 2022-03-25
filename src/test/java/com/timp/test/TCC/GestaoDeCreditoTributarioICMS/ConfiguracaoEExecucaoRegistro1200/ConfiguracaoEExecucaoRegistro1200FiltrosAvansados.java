package com.timp.test.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucaoRegistro1200;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucaoRegistro1200.ConfiguracaoEExecucaoRegistro1200FiltrosAvansadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConfiguracaoEExecucaoRegistro1200FiltrosAvansados extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ConfiguracaoEExecucaoRegistro1200FiltrosAvansadosPO configuracaoEExecucaoRegistro1200FiltrosAvansadosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configuracaoEExecucaoRegistro1200FiltrosAvansadosPO = new ConfiguracaoEExecucaoRegistro1200FiltrosAvansadosPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}


	@Test()
	public void filtrosAvancados() {
		
		loginTC.login();
		acessarTCCPO.acessarTCC();

		configuracaoEExecucaoRegistro1200FiltrosAvansadosPO.filtros();

		ArrayList<Boolean> empresa = configuracaoEExecucaoRegistro1200FiltrosAvansadosPO.Empresa();
		for (int i = 0; i < empresa.size(); i++) {
			assertTrue(empresa.get(i), Filtros);
		}

		ArrayList<Boolean> uf = configuracaoEExecucaoRegistro1200FiltrosAvansadosPO.Uf();
		for (int i = 0; i < uf.size(); i++) {
			assertTrue(uf.get(i), Filtros);
		}

		ArrayList<Boolean> filial = configuracaoEExecucaoRegistro1200FiltrosAvansadosPO.Filial();
		for (int i = 0; i < filial.size(); i++) {
			assertTrue(filial.get(i), Filtros);
		}
	}

}
