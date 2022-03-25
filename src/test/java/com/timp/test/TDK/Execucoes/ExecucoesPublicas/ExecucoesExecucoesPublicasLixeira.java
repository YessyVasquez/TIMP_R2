package com.timp.test.TDK.Execucoes.ExecucoesPublicas;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Execucoes.ExecucoesPublicas.ExecucoesExecucoesPublicasLixeiraPO;

public class ExecucoesExecucoesPublicasLixeira extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	ExecucoesExecucoesPublicasLixeiraPO execucoesLixeiraPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		execucoesLixeiraPO = new ExecucoesExecucoesPublicasLixeiraPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void lixeira() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		boolean sucesso = execucoesLixeiraPO.lixeira();
		assertTrue(sucesso, "Não foi possível ir para Lixeira");
	}
}
