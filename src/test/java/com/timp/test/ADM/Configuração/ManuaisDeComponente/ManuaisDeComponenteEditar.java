package com.timp.test.ADM.Configuração.ManuaisDeComponente;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTipoTributo.ConfiguracaoDeTipoTributoEditarPO;
import com.sap.timp.pageObjectModel.ADM.Configuração.ManuaisDeComponente.ManuaisDeComponenteEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ManuaisDeComponenteEditar extends TestBaseSteven {
	LoginTC loginTC; 
	AcessarADMPO acessarADMPO;
	ManuaisDeComponenteEditarPO manuaisDeComponenteEditarPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  manuaisDeComponenteEditarPO = new ManuaisDeComponenteEditarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

	
	@Test()
	public void editar() {

		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = manuaisDeComponenteEditarPO.editar();

		assertTrue(sucesso, Editar);
		sleep(2000);
		
	}
 
}
