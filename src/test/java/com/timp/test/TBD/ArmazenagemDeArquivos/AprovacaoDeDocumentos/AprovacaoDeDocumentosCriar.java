package com.timp.test.TBD.ArmazenagemDeArquivos.AprovacaoDeDocumentos;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;
import com.sap.timp.pageObjectModel.TBD.ArmazenagemDeArquivos.AprovacaoDeDocumentos.AprovacaoDeDocumentosCriarPO;

public class AprovacaoDeDocumentosCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTBDPO acessarTBDPO;
	AprovacaoDeDocumentosCriarPO aprovacaoDeDocumentosCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTBDPO = new AcessarTBDPO();
		aprovacaoDeDocumentosCriarPO = new AprovacaoDeDocumentosCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void criar() {
		
		loginTC.login();
		
		acessarTBDPO.acessarTBD();

		boolean sucesso = aprovacaoDeDocumentosCriarPO.criar();
		assertTrue(sucesso, Criar);
		sleep(3000);
	}

}
