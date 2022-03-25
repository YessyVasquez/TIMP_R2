package com.timp.test.MDR.TabelasApoioSped.DeParaLivroApuraçaoXSpedFiscal;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.DeParaLivroApuraçaoXSpedFiscal.DeParaLivroApuraçaoXSpedFiscalEditarPO;

public class DeParaLivroApuraçaoXSpedFiscalEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeParaLivroApuraçaoXSpedFiscalEditarPO deParaLivroApuraçaoXSpedFiscalEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		deParaLivroApuraçaoXSpedFiscalEditarPO = new DeParaLivroApuraçaoXSpedFiscalEditarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = deParaLivroApuraçaoXSpedFiscalEditarPO.editar();

		assertTrue(sucesso, Editar);
	}

}
