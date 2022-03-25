package com.timp.test.BRE.RegrasdeAuditoriaN2.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.ParametrosGerais.RegrasDeAuditoriaN2LixeiraEmMassaMaisExcluirEmMassaPO;

public class RegrasDeAuditoriaN2LixeiraEmMassaMaisExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeAuditoriaN2LixeiraEmMassaMaisExcluirEmMassaPO regrasDeAuditoriaN2LixeiraEmMassaMaisExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeAuditoriaN2LixeiraEmMassaMaisExcluirEmMassaPO = new RegrasDeAuditoriaN2LixeiraEmMassaMaisExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}
	@Test()
	public void criar() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		ArrayList<Boolean> sucesso = regrasDeAuditoriaN2LixeiraEmMassaMaisExcluirEmMassaPO.criar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}

	}
}
