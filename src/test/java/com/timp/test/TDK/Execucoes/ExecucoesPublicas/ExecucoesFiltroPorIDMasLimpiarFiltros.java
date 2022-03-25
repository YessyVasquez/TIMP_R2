package com.timp.test.TDK.Execucoes.ExecucoesPublicas;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Execucoes.ExecucoesPublicas.ExecucoesFiltroPorIDMasLimpiarFiltrosPO;

public class ExecucoesFiltroPorIDMasLimpiarFiltros extends TestBaseFernando{
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	ExecucoesFiltroPorIDMasLimpiarFiltrosPO execucoesFiltroPorIDMasLimpiarFiltrosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		execucoesFiltroPorIDMasLimpiarFiltrosPO = new ExecucoesFiltroPorIDMasLimpiarFiltrosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void detalhes() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		ArrayList<Boolean> sucesso = execucoesFiltroPorIDMasLimpiarFiltrosPO.filtroPorID();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}
	}
}
