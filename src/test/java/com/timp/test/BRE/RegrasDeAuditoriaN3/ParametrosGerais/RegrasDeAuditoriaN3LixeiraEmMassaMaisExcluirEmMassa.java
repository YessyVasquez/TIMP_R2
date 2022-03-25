package com.timp.test.BRE.RegrasDeAuditoriaN3.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN3.ParametrosGerais.RegrasDeAuditoriaN3LixeiraEmMassaMaisExcluirEmMassaPO;

public class RegrasDeAuditoriaN3LixeiraEmMassaMaisExcluirEmMassa extends TestBaseSteven {
 
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeAuditoriaN3LixeiraEmMassaMaisExcluirEmMassaPO regrasDeAuditoriaN3LixeiraEmMassaMaisExcluirEmMassaPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeAuditoriaN3LixeiraEmMassaMaisExcluirEmMassaPO = new RegrasDeAuditoriaN3LixeiraEmMassaMaisExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void excluirEmMassa() {
		
		loginTC.login();
		acessarBREPO.acessarBRE();
		
		ArrayList<Boolean> sucesso = regrasDeAuditoriaN3LixeiraEmMassaMaisExcluirEmMassaPO.criar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
		
	}
}
