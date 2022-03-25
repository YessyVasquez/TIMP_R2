package com.timp.test.TDK.Execucoes.ExecucoesPublicas;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Execucoes.ExecucoesPublicas.ExecucoesExecucoesPublicasExcluirDefinitivamenteDashboardPO;
import com.sap.timp.pageObjectModel.TDK.Execucoes.ExecucoesPublicas.ExecucoesExecucoesPublicasExcluirDefinitivamenteKpisPO;

public class ExecucoesExecucoesPublicasExcluirDefinitivamenteDashboard  extends TestBaseKenssy {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	ExecucoesExecucoesPublicasExcluirDefinitivamenteDashboardPO execucoesExecucoesPublicasExcluirDefinitivamenteDashboardPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		execucoesExecucoesPublicasExcluirDefinitivamenteDashboardPO = new ExecucoesExecucoesPublicasExcluirDefinitivamenteDashboardPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		ArrayList<Boolean> sucesso = execucoesExecucoesPublicasExcluirDefinitivamenteDashboardPO.excluir();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
	}

}
