package com.timp.test.BRE.RegrasdeAuditoriaN1.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasAuditoriaN1.ParametrosGerais.RegrasDeAuditoriaN1LixeiraMaisExcluirDefinitivamentePO;

public class RegrasDeAuditoriaN1LixeiraMaisExcluirDefinitivamente extends TestBaseSteven{
 
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeAuditoriaN1LixeiraMaisExcluirDefinitivamentePO regrasDeAuditoriaN1LixeiraMaisExcluirDefinitivamentePO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeAuditoriaN1LixeiraMaisExcluirDefinitivamentePO = new RegrasDeAuditoriaN1LixeiraMaisExcluirDefinitivamentePO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void excluir() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		ArrayList<Boolean> sucesso = regrasDeAuditoriaN1LixeiraMaisExcluirDefinitivamentePO.excluir();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "O registro não foi excluido");
		}
		
	}
}
