package com.timp.test.TAA.Agendamento;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.Agendamento.AgendamentoEditarPO;

public class AgendamentoEditar extends TestBaseFernando {
	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;
	AgendamentoEditarPO agendamentoEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF(); 
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		agendamentoEditarPO = new AgendamentoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void editar() {
		
		loginTC.login();
		acessarTAAPO.acessarTAA();
		boolean sucesso = agendamentoEditarPO.editar();
		assertTrue(sucesso, Editar);
	}
}
