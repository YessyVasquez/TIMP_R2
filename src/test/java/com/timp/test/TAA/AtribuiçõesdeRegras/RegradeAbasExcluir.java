package com.timp.test.TAA.AtribuiçõesdeRegras;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.Agendamento.AgendamentoExcluirPO;
import com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras.RegradeAbasExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegradeAbasExcluir extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;
	RegradeAbasExcluirPO regradeAbasExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		regradeAbasExcluirPO = new RegradeAbasExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarTAAPO.acessarTAA();
		boolean sucesso = regradeAbasExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
		sleep(2000);
	}
}
