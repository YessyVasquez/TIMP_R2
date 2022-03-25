package com.timp.test.SCANC.RelatoriosRefineriaGerados;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.SCANC.AcessarSCANCPO;
import com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados.RelatorioRefineriaGeradosManutencaoEditarLancamentoPO;

public class RelatorioRefineriaGeradosManutencaoEditarLancamento extends TestBaseFernando {
	LoginTC loginTC;
	AcessarSCANCPO acessarSCANCPO;
	RelatorioRefineriaGeradosManutencaoEditarLancamentoPO relatorioRefineriaGeradosManutencaoEditarLancamentoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarSCANCPO = new AcessarSCANCPO();
		relatorioRefineriaGeradosManutencaoEditarLancamentoPO = new RelatorioRefineriaGeradosManutencaoEditarLancamentoPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void scancEntrar() {
		acessarSCANCPO.acessarSCANC();
	}

	@Test(priority = 2)
	public void manutencaoEditarLancamento() {
		boolean sucesso = relatorioRefineriaGeradosManutencaoEditarLancamentoPO.manutencaoEditarLancamento();
		assertTrue(sucesso, Editar);
	}
}
