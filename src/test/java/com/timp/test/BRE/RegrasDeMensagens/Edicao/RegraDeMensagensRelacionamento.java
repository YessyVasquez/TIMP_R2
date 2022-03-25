package com.timp.test.BRE.RegrasDeMensagens.Edicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeMensagens.Edicao.RegraDeMensagensRelacionamentoPO;
public class RegraDeMensagensRelacionamento extends TestBaseFernando{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegraDeMensagensRelacionamentoPO regraDeMensagensRelacionamentoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regraDeMensagensRelacionamentoPO = new RegraDeMensagensRelacionamentoPO();
	}


	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	
	@Test()
	public void relacionamento() {
		
		loginTC.login();
		
		acessarBREPO.acessarBRE();
		
		boolean sucesso = regraDeMensagensRelacionamentoPO.relacionamento();
		assertTrue(sucesso, Editar);
	}
}
