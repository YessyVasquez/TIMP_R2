package com.timp.test.DFG.Configuracoes;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Configuracoes.ConfiguracoesCriarGrerenciarMoverPastaPO;

public class ConfiguracoesCriarGrerenciarMoverPasta extends TestBaseFernando{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	ConfiguracoesCriarGrerenciarMoverPastaPO configuracoesCriarGrerenciarMoverPastaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		configuracoesCriarGrerenciarMoverPastaPO = new ConfiguracoesCriarGrerenciarMoverPastaPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}


	

	@Test()
	
	public void criarGerenciarMoverPasta() {
		loginTC.login();
		acessarDFGPO.acessarDFG();
		boolean sucesso = configuracoesCriarGrerenciarMoverPastaPO.criarGerenciarMoverPasta();
		assertTrue(sucesso, Criar);
	}
}
