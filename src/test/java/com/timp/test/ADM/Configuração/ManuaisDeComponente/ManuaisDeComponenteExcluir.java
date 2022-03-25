package com.timp.test.ADM.Configuração.ManuaisDeComponente;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ManuaisDeComponente.ManuaisDeComponenteCriarPO;
import com.sap.timp.pageObjectModel.ADM.Configuração.ManuaisDeComponente.ManuaisDeComponenteExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ManuaisDeComponenteExcluir extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ManuaisDeComponenteExcluirPO manuaisDeComponenteExcluirPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  manuaisDeComponenteExcluirPO = new ManuaisDeComponenteExcluirPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  

	
	@Test()
	public void Excluir() {
		loginTC.login();
		acessarADMPO.acessarADM();
		
		boolean sucesso = manuaisDeComponenteExcluirPO.exluir();
		assertTrue(sucesso, eliminar);
		sleep(2000);
		
	}
}
