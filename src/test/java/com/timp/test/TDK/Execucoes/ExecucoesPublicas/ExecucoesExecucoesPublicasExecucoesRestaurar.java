package com.timp.test.TDK.Execucoes.ExecucoesPublicas;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Execucoes.ExecucoesPublicas.ExecucoesExecucoesPublicasRestaurarPO;

public class ExecucoesExecucoesPublicasExecucoesRestaurar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	ExecucoesExecucoesPublicasRestaurarPO execucoesRestaurarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		execucoesRestaurarPO = new ExecucoesExecucoesPublicasRestaurarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void restaurar() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		ArrayList<Boolean> sucesso = execucoesRestaurarPO.restaurar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "Não foi possível restaurar.");
		}
	}
}
