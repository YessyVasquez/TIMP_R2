package com.timp.test.ADM.Configuração.Usuarios;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.Usuarios.UsuariosEditarPO;
import com.sap.timp.pageObjectModel.ADM.Configuração.Usuarios.UsuáriosVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class UsuáriosVisualizar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	UsuáriosVisualizarPO usuáriosVisualizarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  usuáriosVisualizarPO = new UsuáriosVisualizarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  

	@Test
	public void ver() {
		
		loginTC.login();
		
		acessarADMPO.acessarADM();

		ArrayList<Boolean> sucesso = usuáriosVisualizarPO.Visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
		sleep(2000);
	}


}
