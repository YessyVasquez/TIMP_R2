package com.timp.test.TCC.BancoDeCreditoExtemporaneo.PainelBCE.ConfiguracaoEExecucao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.PainelBCE.ConfiguracaoEExecucao.PainelBCEConfiguracaoeExecucaoVisualizarPO;
import com.timp.test.BRB.Visualizar;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class PainelBCEConfiguracaoeExecucaoVisualizar extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	PainelBCEConfiguracaoeExecucaoVisualizarPO painelBCEConfiguracaoeExecucaoVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationKen();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		painelBCEConfiguracaoeExecucaoVisualizarPO = new PainelBCEConfiguracaoeExecucaoVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
	  driver.close();
	}


	@Test()
	public void visualizar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		
		ArrayList<Boolean> sucesso = painelBCEConfiguracaoeExecucaoVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}

}
