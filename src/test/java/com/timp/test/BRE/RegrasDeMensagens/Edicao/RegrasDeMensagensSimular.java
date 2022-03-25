package com.timp.test.BRE.RegrasDeMensagens.Edicao;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeMensagens.Edicao.RegrasDeMensagensSimularPO;


public class RegrasDeMensagensSimular extends TestBaseSteven {
	
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeMensagensSimularPO regrasDeMensagensSimularPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeMensagensSimularPO = new RegrasDeMensagensSimularPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void simular() {
		
		loginTC.login();
		
		acessarBREPO.acessarBRE();
		
		
		boolean sucesso = regrasDeMensagensSimularPO.simular();
		
		assertTrue(sucesso, filtros);
		
	}
 
 
}
