package com.timp.test.TCC.BancoDeOcorrencias.Executados;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.Executados.ExecutadosEditarPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeOcorrencias.Executados.BancodeOcorrênciasExecutadosEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class BancodeOcorrênciasExecutadosEditar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	BancodeOcorrênciasExecutadosEditarPO bancodeOcorrênciasExecutadosEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		bancodeOcorrênciasExecutadosEditarPO = new BancodeOcorrênciasExecutadosEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void executarEditar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = bancodeOcorrênciasExecutadosEditarPO.editar();
		assertTrue(sucesso, Criar);
		 
	}
}
