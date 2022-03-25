package com.timp.test.BRE.Lixeira.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.Lixeira.ParametrosGerais.LixeiraExcluirPO;

public class LixeiraExcluir extends TestBaseSteven {	
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	LixeiraExcluirPO lixeiraExcluirPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		lixeiraExcluirPO = new LixeiraExcluirPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}
	
	@Test()
	public void criar() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		ArrayList<Boolean> sucesso = lixeiraExcluirPO.excluir();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}		
	}
}
