package com.timp.test.BRE.RegrasDeNegocio.Edicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.Edicao.RegrasDeNegocioEdicaoRelacionamentoPO;

public class RegrasDeNegocioEdicaoRelacionamento extends TestBaseFernando{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeNegocioEdicaoRelacionamentoPO regrasDeNegocioEdicaoRelacionamentoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeNegocioEdicaoRelacionamentoPO = new RegrasDeNegocioEdicaoRelacionamentoPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}


	
	@Test()
	public void relacionamento() {
		
		loginTC.login();
		acessarBREPO.acessarBRE();
		
		boolean sucesso = regrasDeNegocioEdicaoRelacionamentoPO.relacionamento();
		assertTrue(sucesso, Editar);
	}
}
