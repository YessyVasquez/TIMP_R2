package com.timp.test.TBD.Configuração.TipoDeDocumento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;
import com.sap.timp.pageObjectModel.TBD.Configuracao.TipoDeDocumento.TipoDeDocumentoVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class TipoDeDocumentoVisualizar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTBDPO acessarTBDPO;
	TipoDeDocumentoVisualizarPO tipoDeDocumentoVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTBDPO = new AcessarTBDPO();
		tipoDeDocumentoVisualizarPO = new TipoDeDocumentoVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}



	@Test()
	public void visualizar() {
		loginTC.login();
		acessarTBDPO.acessarTBD();
		ArrayList<Boolean> sucesso = tipoDeDocumentoVisualizarPO.visualizar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
		sleep(3000);
	}
}
