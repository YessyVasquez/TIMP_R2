package com.timp.test.SCANC.RelatoriosRefineriaGerados;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.SCANC.AcessarSCANCPO;
import com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados.RelatoriosRefineriaGeradosGerarAnexos6712MasVisualizacaoPO;

public class RelatoriosRefineriaGeradosGerarAnexos6712MasVisualizacao extends TestBaseFernando {
	LoginTC loginTC;
	AcessarSCANCPO acessarSCANCPO;
	RelatoriosRefineriaGeradosGerarAnexos6712MasVisualizacaoPO relatoriosRefineriaGeradosGerarAnexos6712MasVisualizacaoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarSCANCPO = new AcessarSCANCPO();
		relatoriosRefineriaGeradosGerarAnexos6712MasVisualizacaoPO = new RelatoriosRefineriaGeradosGerarAnexos6712MasVisualizacaoPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
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
	public void gerarAnexosMasVisualizacao() {
		ArrayList<Boolean> sucesso = relatoriosRefineriaGeradosGerarAnexos6712MasVisualizacaoPO
				.gerarAnexosMasVisualizacao();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
}
