package com.timp.test.TBD.ArmazenagemDeArquivos.AprovacaoDeDocumentos;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;
import com.sap.timp.pageObjectModel.TBD.ArmazenagemDeArquivos.AprovacaoDeDocumentos.AprovacaoDeDocumentosVisualizarPO;

public class AprovacaoDeDocumentosVisualizar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTBDPO acessarTBDPO;
	AprovacaoDeDocumentosVisualizarPO aprovacaoDeDocumentosVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTBDPO = new AcessarTBDPO();
		aprovacaoDeDocumentosVisualizarPO = new AprovacaoDeDocumentosVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void visualizar() {
		
		loginTC.login();
		
		acessarTBDPO.acessarTBD();
		
		ArrayList<Boolean> sucesso = aprovacaoDeDocumentosVisualizarPO.visualizar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
		sleep(3000);
	}
}
