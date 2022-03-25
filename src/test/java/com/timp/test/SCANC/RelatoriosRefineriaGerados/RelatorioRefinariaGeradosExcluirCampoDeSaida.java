package com.timp.test.SCANC.RelatoriosRefineriaGerados;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.SCANC.AcessarSCANCPO;
import com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados.RelatorioRefinariaGeradosExcluirCampoDeSaidaPO;

public class RelatorioRefinariaGeradosExcluirCampoDeSaida extends TestBaseFernando {
	LoginTC loginTC;
	AcessarSCANCPO acessarSCANCPO;
	RelatorioRefinariaGeradosExcluirCampoDeSaidaPO relatorioRefinariaGeradosExcluirCampoDeSaidaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarSCANCPO = new AcessarSCANCPO();
		relatorioRefinariaGeradosExcluirCampoDeSaidaPO = new RelatorioRefinariaGeradosExcluirCampoDeSaidaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
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
	public void excluir() {
		boolean sucesso = relatorioRefinariaGeradosExcluirCampoDeSaidaPO.excluir();
		assertTrue(sucesso, Eliminado);
	}
}
