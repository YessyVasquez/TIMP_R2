package com.timp.test.BRE.RegrasDeMensagens.Edicao;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeMensagens.Edicao.RegrasDeMensagensEstruturasPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeMensagens.Edicao.RegrasDeMensagensSimularPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeMensagens.Edicao.RegrasDeMensagensTabelasPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeMensagens.Edicao.RegrasDeMensagensValoresCalculadosPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeMensagens.ParametrosGerais.RegrasDeMensagensEditarPO;

public class RegrasDeMensagensValoresCalculados extends TestBaseSteven {
	
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeMensagensValoresCalculadosPO regrasDeMensagensValoresCalculadosPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeMensagensValoresCalculadosPO = new RegrasDeMensagensValoresCalculadosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void valoresCalculados() {
		
		loginTC.login();
		
		acessarBREPO.acessarBRE();
		
		ArrayList<Boolean> sucesso = regrasDeMensagensValoresCalculadosPO.valoresCalculados();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Editar);
		}
		
	}
 
 
}
