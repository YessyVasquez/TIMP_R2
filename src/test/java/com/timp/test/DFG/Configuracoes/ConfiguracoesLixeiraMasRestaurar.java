package com.timp.test.DFG.Configuracoes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Configuracoes.ConfiguracoesLixeiraMasRestaurarPO;

public class ConfiguracoesLixeiraMasRestaurar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	ConfiguracoesLixeiraMasRestaurarPO configuracoesLixeiraMasRestaurarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		configuracoesLixeiraMasRestaurarPO = new ConfiguracoesLixeiraMasRestaurarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void lixeiraMasRestaurar() {
		
		loginTC.login();
		acessarDFGPO.acessarDFG();
		configuracoesLixeiraMasRestaurarPO.lixeiraMasRestaurar();
	}
}
