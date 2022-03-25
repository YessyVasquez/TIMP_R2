package com.timp.test.BRE.RegrasDeEscrituração.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.ParametrosGerais.RegrasDeEscrituraçãoCriarComCopiaPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.ParametrosGerais.RegrasDeEscrituraçãoCriarMasCaminhoPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.ParametrosGerais.RegrasDeEscrituraçãoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RegrasDeEscrituraçãoEditar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeEscrituraçãoEditarPO regrasDeEscrituraçãoEditarPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeEscrituraçãoEditarPO = new RegrasDeEscrituraçãoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}


	@Test()
	public void editar() {
		
		loginTC.login();
		
		acessarBREPO.acessarBRE();
		
		ArrayList<Boolean> sucesso = regrasDeEscrituraçãoEditarPO.editar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), editado);
		}
		
		
	}
}
