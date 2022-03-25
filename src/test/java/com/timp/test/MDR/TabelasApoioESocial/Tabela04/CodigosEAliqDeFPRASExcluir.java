package com.timp.test.MDR.TabelasApoioESocial.Tabela04;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela04.CodigosEAliqDeFPRASExcluirPO;

public class CodigosEAliqDeFPRASExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigosEAliqDeFPRASExcluirPO codigosEAliqDeFPRASExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigosEAliqDeFPRASExcluirPO = new CodigosEAliqDeFPRASExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = codigosEAliqDeFPRASExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}
}
