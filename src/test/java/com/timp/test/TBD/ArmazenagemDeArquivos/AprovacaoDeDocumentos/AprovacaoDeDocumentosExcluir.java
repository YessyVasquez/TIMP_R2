package com.timp.test.TBD.ArmazenagemDeArquivos.AprovacaoDeDocumentos;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;
import com.sap.timp.pageObjectModel.TBD.ArmazenagemDeArquivos.AprovacaoDeDocumentos.AprovacaoDeDocumentosExcluirPO;

public class AprovacaoDeDocumentosExcluir extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTBDPO acessarTBDPO;
	AprovacaoDeDocumentosExcluirPO aprovacaoDeDocumentosExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTBDPO = new AcessarTBDPO();
		aprovacaoDeDocumentosExcluirPO = new AprovacaoDeDocumentosExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void excluir() {
		loginTC.login();
		
		acessarTBDPO.acessarTBD();

		boolean sucesso = aprovacaoDeDocumentosExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
		sleep(3000);
	}
}
