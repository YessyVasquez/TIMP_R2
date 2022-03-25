package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.RegistroM700;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.RegistroM700.RegistroM700EditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegistroM700Editar extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	RegistroM700EditarPO registroM700EditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		registroM700EditarPO = new RegistroM700EditarPO();
	}

	
	@AfterClass
	public void afterClass() {
		driver.close();
	}

	
	@Test()
	public void editar() {

		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = registroM700EditarPO.editar();
		assertTrue(sucesso, editado);
	}
}
