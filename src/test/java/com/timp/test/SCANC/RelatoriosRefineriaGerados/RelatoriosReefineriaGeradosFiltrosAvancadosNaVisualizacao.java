package com.timp.test.SCANC.RelatoriosRefineriaGerados;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.SCANC.AcessarSCANCPO;
import com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados.RelatoriosReefineriaGeradosFiltrosAvancadosNaVisualizacaoPO;

public class RelatoriosReefineriaGeradosFiltrosAvancadosNaVisualizacao extends TestBaseFernando {
	LoginTC loginTC;
	AcessarSCANCPO acessarSCANCPO;
	RelatoriosReefineriaGeradosFiltrosAvancadosNaVisualizacaoPO relatoriosReefineriaGeradosFiltrosAvancadosNaVisualizacaoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarSCANCPO = new AcessarSCANCPO();
		relatoriosReefineriaGeradosFiltrosAvancadosNaVisualizacaoPO = new RelatoriosReefineriaGeradosFiltrosAvancadosNaVisualizacaoPO();
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
	public void filtrosAvancadosNavisualizacao() {
		ArrayList<Boolean> sucesso = relatoriosReefineriaGeradosFiltrosAvancadosNaVisualizacaoPO
				.filtrosAvancadosNavisualizacao();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
}
