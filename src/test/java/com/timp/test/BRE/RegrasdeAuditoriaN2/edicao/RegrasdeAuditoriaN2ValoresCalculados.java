package com.timp.test.BRE.RegrasdeAuditoriaN2.edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.Edicao.RegrasdeAuditoriaN2ValoresCalculadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasdeAuditoriaN2ValoresCalculados extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasdeAuditoriaN2ValoresCalculadosPO regrasdeAuditoriaN2ValoresCalculadosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasdeAuditoriaN2ValoresCalculadosPO = new RegrasdeAuditoriaN2ValoresCalculadosPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}


	@Test()
	public void editar() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		boolean sucesso = regrasdeAuditoriaN2ValoresCalculadosPO.editar();
		assertTrue(sucesso, Editar);

	}

}
