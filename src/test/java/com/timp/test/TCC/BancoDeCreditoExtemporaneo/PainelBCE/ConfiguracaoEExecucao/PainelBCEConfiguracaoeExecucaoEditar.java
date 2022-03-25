package com.timp.test.TCC.BancoDeCreditoExtemporaneo.PainelBCE.ConfiguracaoEExecucao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.PainelBCE.ConfiguracaoEExecucao.PainelBCEConfiguracaoeExecucaoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class PainelBCEConfiguracaoeExecucaoEditar extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	PainelBCEConfiguracaoeExecucaoEditarPO painelBCEConfiguracaoeExecucaoEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationKen();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		painelBCEConfiguracaoeExecucaoEditarPO = new PainelBCEConfiguracaoeExecucaoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = painelBCEConfiguracaoeExecucaoEditarPO.editar();
		assertTrue(sucesso, editado);	
	}

}
