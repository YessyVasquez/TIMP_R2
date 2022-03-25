package com.timp.test.SCANC.ArquivosImportados;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.SCANC.AcessarSCANCPO;
import com.sap.timp.pageObjectModel.SCANC.ArquivosImportados.ArquivosImportadosVisualizarPO;

public class ArquivosImportadosVisualizar extends TestBaseFernando {
	LoginTC loginTC;
	AcessarSCANCPO acessarSCANCPO;
	ArquivosImportadosVisualizarPO arquivosImportadosVisualizarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarSCANCPO = new AcessarSCANCPO();
		arquivosImportadosVisualizarPO = new ArquivosImportadosVisualizarPO();
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
	public void filtrosAvancados() {
		ArrayList<Boolean> sucesso = arquivosImportadosVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), EmpresaVisualizar);
		}
	}
}
