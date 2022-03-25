package com.timp.test.MDR.OcorrenciaFiscal.TiposDeObjetosDeOcorrenciasFiscais;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.OcorrenciaFiscal.TiposDeObjetosDeOcorrenciasFiscais.TiposDeObjetosDeOcorrenciasFiscaisEditarPO;

public class TiposDeObjetosDeOcorrenciasFiscaisEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TiposDeObjetosDeOcorrenciasFiscaisEditarPO tiposDeObjetosDeOcorrenciasFiscaisEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tiposDeObjetosDeOcorrenciasFiscaisEditarPO = new TiposDeObjetosDeOcorrenciasFiscaisEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = tiposDeObjetosDeOcorrenciasFiscaisEditarPO.editar();

		assertTrue(sucesso, Editar);

	}

}
