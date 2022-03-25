package com.timp.test.MDR.CadastrosIRPJCSLL.CadastroContaisContabeis;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.CadastroContasContábeis.CadastroContasContábeisFiltroIdPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CadastroContaisContabeisFiltroID extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CadastroContasContábeisFiltroIdPO cadastroContasContábeisFiltroIdPO;
 
  @BeforeClass
  public void beforeClass() {
	  
	  	driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		cadastroContasContábeisFiltroIdPO = new CadastroContasContábeisFiltroIdPO();
		
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  


	@Test()
	public void filtro() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();
		
		//cadastroContasContábeisFiltroIdPO.filtro();
		boolean sucesso = cadastroContasContábeisFiltroIdPO.filtro();

		assertTrue(sucesso, Filtros);
		sleep(2000);

	}

}
