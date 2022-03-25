package com.timp.test.MDR.TabelasApoioESocial.Tabela19;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class MotivosdeDesligamentoCriar extends TestBaseKenssy {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MotivosdeDesligamentoCriarPO motivoDesligamentoCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		motivoDesligamentoCriarPO = new MotivosdeDesligamentoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criarMotivoDesligamento() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = motivoDesligamentoCriarPO.criarMotivoDesligamento();
		assertTrue(sucesso, Criar);
	}

}
