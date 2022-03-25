package com.timp.test.TCC.BancoDeCreditoExtemporaneo.ConfiguracaoEExecucao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.ConfiguracaoEExecucao.ConfiguracaoEExecucaoFiltrosAvançadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConfiguracaoEExecucaoFiltrosAvançados extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ConfiguracaoEExecucaoFiltrosAvançadosPO configuracaoEExecucaoFiltrosAvançadosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configuracaoEExecucaoFiltrosAvançadosPO = new ConfiguracaoEExecucaoFiltrosAvançadosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void Filtro() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		

		configuracaoEExecucaoFiltrosAvançadosPO.filtro();

		ArrayList<Boolean> Nome = configuracaoEExecucaoFiltrosAvançadosPO.Empresa();
		for (int i = 0; i < Nome.size(); i++) {
			assertTrue(Nome.get(i), Filtros);
		}

		ArrayList<Boolean> uf = configuracaoEExecucaoFiltrosAvançadosPO.uF();
		for (int i = 0; i < uf.size(); i++) {
			assertTrue(uf.get(i), Filtros);
		}

		ArrayList<Boolean> filial = configuracaoEExecucaoFiltrosAvançadosPO.filial();
		for (int i = 0; i < filial.size(); i++) {
			assertTrue(filial.get(i), Filtros);
		}

	}

}
