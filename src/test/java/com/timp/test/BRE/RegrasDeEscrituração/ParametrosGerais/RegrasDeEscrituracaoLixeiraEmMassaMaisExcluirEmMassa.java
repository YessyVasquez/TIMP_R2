package com.timp.test.BRE.RegrasDeEscrituração.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.ParametrosGerais.RegrasDeEscrituracaoLixeiraEmMassaMaisExcluirEmMassaPO;

public class RegrasDeEscrituracaoLixeiraEmMassaMaisExcluirEmMassa extends TestBaseSteven{
 
	
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeEscrituracaoLixeiraEmMassaMaisExcluirEmMassaPO regrasDeEscrituracaoLixeiraEmMassaMaisExcluirEmMassaPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeEscrituracaoLixeiraEmMassaMaisExcluirEmMassaPO = new RegrasDeEscrituracaoLixeiraEmMassaMaisExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	
	@Test()
	public void lixeiraEmMassaMaisExcluirEmMassa() {
		
		loginTC.login();
		
		acessarBREPO.acessarBRE();
		
		
		ArrayList<Boolean> sucesso = regrasDeEscrituracaoLixeiraEmMassaMaisExcluirEmMassaPO.criar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
		
	}
}
