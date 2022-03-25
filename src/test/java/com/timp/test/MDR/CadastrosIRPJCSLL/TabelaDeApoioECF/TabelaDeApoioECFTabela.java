package com.timp.test.MDR.CadastrosIRPJCSLL.TabelaDeApoioECF;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.TabelaDeApoioECF.TabelaDeApoioECFTabelaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TabelaDeApoioECFTabela extends TestBaseFernando{
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeApoioECFTabelaPO tabelaDeApoioECFTabelaPO;
  
  @BeforeClass
  public void beforeClass() {

		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeApoioECFTabelaPO = new TabelaDeApoioECFTabelaPO();
		
  }

  @AfterClass
  public void afterClass() {
		driver.close();
  }
  @Test()
	public void novaTabela() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = tabelaDeApoioECFTabelaPO.criar();
		assertTrue(sucesso, semAcesso);

	}
  
  @Test(dependsOnMethods = "novaTabela")
	public void excluir() {
	    
		boolean sucesso = tabelaDeApoioECFTabelaPO.Excluir();
		assertTrue(sucesso, Criar);
		sleep(2000);
	}
}
