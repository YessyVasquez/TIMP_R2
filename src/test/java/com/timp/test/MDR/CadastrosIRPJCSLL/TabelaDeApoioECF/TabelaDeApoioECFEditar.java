package com.timp.test.MDR.CadastrosIRPJCSLL.TabelaDeApoioECF;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.TabelaDeApoioECF.TabelaDeApoioECFEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TabelaDeApoioECFEditar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeApoioECFEditarPO tabelaDeApoioECFEditarPO;
  @BeforeClass
  public void beforeClass() {
	  driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeApoioECFEditarPO = new TabelaDeApoioECFEditarPO();
  }

  @AfterClass
  public void afterClass() {
	//driver.close();
  }
  @Test()
	public void Editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = tabelaDeApoioECFEditarPO.Editar();
		assertTrue(sucesso, Criar);
		sleep(2000);
	}
}
