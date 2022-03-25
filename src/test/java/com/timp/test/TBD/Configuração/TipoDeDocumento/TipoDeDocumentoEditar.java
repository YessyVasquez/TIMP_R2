package com.timp.test.TBD.Configuração.TipoDeDocumento;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;
import com.sap.timp.pageObjectModel.TBD.Configuracao.TipoDeDocumento.TipoDeDocumentoEditarPO;

public class TipoDeDocumentoEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTBDPO acessarTBDPO;
	TipoDeDocumentoEditarPO tipoDeDocumentoEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTBDPO = new AcessarTBDPO();
		tipoDeDocumentoEditarPO = new TipoDeDocumentoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void editar() {
		loginTC.login();
		acessarTBDPO.acessarTBD();
		boolean sucesso = tipoDeDocumentoEditarPO.editar();
		assertTrue(sucesso, Editar);
		sleep(3000);
	}
}
