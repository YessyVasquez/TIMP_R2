package com.timp.test.BRE.RegrasdeAuditoriaN1.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasAuditoriaN1.Edicao.RegrasdeAuditoriaN1EdiçãoSimulaPO;
import com.sap.timp.pageObjectModel.BRE.RegrasAuditoriaN1.ParametrosGerais.RegrasdeAuditoriaN1ParâmetrosgeraisSimularPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasdeAuditoriaN1ParâmetrosgeraisSimular extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasdeAuditoriaN1ParâmetrosgeraisSimularPO regrasdeAuditoriaN1ParâmetrosgeraisSimularPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasdeAuditoriaN1ParâmetrosgeraisSimularPO = new RegrasdeAuditoriaN1ParâmetrosgeraisSimularPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void editar() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		boolean sucesso = regrasdeAuditoriaN1ParâmetrosgeraisSimularPO.editar();
		assertTrue(sucesso, Editar);

	}

}
