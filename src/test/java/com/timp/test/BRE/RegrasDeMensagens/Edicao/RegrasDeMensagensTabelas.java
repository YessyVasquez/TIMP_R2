package com.timp.test.BRE.RegrasDeMensagens.Edicao;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeMensagens.Edicao.RegrasDeMensagensTabelasPO;


public class RegrasDeMensagensTabelas extends TestBaseSteven {
	
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeMensagensTabelasPO regrasDeMensagensTabelasPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeMensagensTabelasPO = new RegrasDeMensagensTabelasPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}


	
	@Test()
	public void tabelas() {
		
		loginTC.login();
		
		acessarBREPO.acessarBRE();
		
		ArrayList<Boolean> sucesso = regrasDeMensagensTabelasPO.tabela();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Editar);
		}
		
	}
 
 
}
