package com.timp.test.TCC.BancoDeCreditoExtemporaneo.PainelBCE.Executados;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.PainelBCE.Executados.PainelBCEExecutadosExcluirPO;

public class PainelBCEExecutadosExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	PainelBCEExecutadosExcluirPO painelBCEExecutadosExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		painelBCEExecutadosExcluirPO = new PainelBCEExecutadosExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void excluir() {
		
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		
		ArrayList<Boolean> sucesso = painelBCEExecutadosExcluirPO.excluir();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}

	}
}
