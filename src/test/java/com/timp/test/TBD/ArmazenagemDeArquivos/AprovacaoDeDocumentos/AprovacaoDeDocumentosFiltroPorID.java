package com.timp.test.TBD.ArmazenagemDeArquivos.AprovacaoDeDocumentos;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;
import com.sap.timp.pageObjectModel.TBD.ArmazenagemDeArquivos.AprovacaoDeDocumentos.AprovacaoDeDocumentosFiltroPorIDPO;

public class AprovacaoDeDocumentosFiltroPorID extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTBDPO acessarTBDPO;
	AprovacaoDeDocumentosFiltroPorIDPO aprovacaoDeDocumentosFiltroPorIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTBDPO = new AcessarTBDPO();
		aprovacaoDeDocumentosFiltroPorIDPO = new AprovacaoDeDocumentosFiltroPorIDPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void filtro() {
		
		loginTC.login();
		
		acessarTBDPO.acessarTBD();

		boolean sucesso = aprovacaoDeDocumentosFiltroPorIDPO.filtro();
		assertTrue(sucesso, Filtros);
		sleep(3000);
	}

}
