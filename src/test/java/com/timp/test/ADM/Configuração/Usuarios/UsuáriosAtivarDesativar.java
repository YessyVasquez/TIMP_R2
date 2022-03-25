package com.timp.test.ADM.Configuração.Usuarios;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.Usuarios.UsuáriosAtivarDesativarPO;
import com.sap.timp.pageObjectModel.ADM.Configuração.Usuarios.UsuáriosDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class UsuáriosAtivarDesativar extends TestBaseSteven {
	LoginTC  loginTC;
	AcessarADMPO  acessarADMPO;
	UsuáriosAtivarDesativarPO usuáriosAtivarDesativarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  usuáriosAtivarDesativarPO = new UsuáriosAtivarDesativarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  
	@Test
	public void ver() {
		loginTC.login();
		acessarADMPO.acessarADM();
		Boolean sucesso = usuáriosAtivarDesativarPO.ativar();
		assertTrue(sucesso, Criar);
		
		sleep(2000);
	}

}
