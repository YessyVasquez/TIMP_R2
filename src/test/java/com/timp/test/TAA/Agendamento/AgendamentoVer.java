package com.timp.test.TAA.Agendamento;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.Agendamento.AgendamentoVerPO;

public class AgendamentoVer extends TestBaseFernando {
	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;
	AgendamentoVerPO agendamentoVerPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		agendamentoVerPO = new AgendamentoVerPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void ver() {
		loginTC.login();
		acessarTAAPO.acessarTAA();
		ArrayList<Boolean> sucesso = agendamentoVerPO.ver();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
}
