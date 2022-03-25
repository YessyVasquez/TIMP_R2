package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.RegistroM515;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.RegistroM515.RegistroM515EditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RegistroM515Editar extends TestBaseSteven{
	
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	RegistroM515EditarPO registroM515EditarPO;
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		registroM515EditarPO = new RegistroM515EditarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

  @Test()
	public void Editar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		
		ArrayList<Boolean> sucesso = registroM515EditarPO.Editar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
}
