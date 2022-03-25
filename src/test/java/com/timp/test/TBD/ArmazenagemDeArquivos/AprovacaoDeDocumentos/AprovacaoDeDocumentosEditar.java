package com.timp.test.TBD.ArmazenagemDeArquivos.AprovacaoDeDocumentos;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;
import com.sap.timp.pageObjectModel.TBD.ArmazenagemDeArquivos.AprovacaoDeDocumentos.AprovacaoDeDocumentosEditarPO;

public class AprovacaoDeDocumentosEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTBDPO acessarTBDPO;
	AprovacaoDeDocumentosEditarPO aprovacaoDeDocumentosEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTBDPO = new AcessarTBDPO();
		aprovacaoDeDocumentosEditarPO = new AprovacaoDeDocumentosEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void editar() {
		
		loginTC.login();
		
		acessarTBDPO.acessarTBD();

		boolean sucesso = aprovacaoDeDocumentosEditarPO.editar();
		assertTrue(sucesso, Editar);

		sleep(3000);
	}

}
