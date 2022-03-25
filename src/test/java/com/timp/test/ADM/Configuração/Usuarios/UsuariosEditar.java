package com.timp.test.ADM.Configuração.Usuarios;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãodeTributoXTributoGrupo.ConfiguraçãodeTributoXTributoGrupoEditarPO;
import com.sap.timp.pageObjectModel.ADM.Configuração.Usuarios.UsuariosEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class UsuariosEditar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	UsuariosEditarPO usuariosEditarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  usuariosEditarPO = new UsuariosEditarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  

	
	@Test
	public void Editar() {

		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = usuariosEditarPO.editar();
		assertTrue(sucesso, Editar);

		sleep(2000);
	}
}
