package com.timp.test.BRE.CalculoDeTributos.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.CalculoDeTributos.Edicao.CálculodeTributosEdiçãoSimularPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.Edicao.RegrasdeAuditoriaN2EdiçãoSimularPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CálculodeTributosEdiçãoSimular extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	CálculodeTributosEdiçãoSimularPO cálculodeTributosEdiçãoSimularPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		cálculodeTributosEdiçãoSimularPO = new CálculodeTributosEdiçãoSimularPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		boolean sucesso = cálculodeTributosEdiçãoSimularPO.editar();
		assertTrue(sucesso, Editar);
	}
}
