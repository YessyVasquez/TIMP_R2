package com.timp.test.MDR.LivrosFiscais.LivrosFiscais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class LivrosFiscaisExcluirEmMassa extends TestBaseKenssy {
		LoginTC loginTC;
		AcessarMDRPO accesarMDR;
		LivrosFiscaisExcluirEmMassaPO livrosFiscaisExcluirEmMassaPO;
	
	  @BeforeClass
	  public void beforeClass() {
		  driver = initializationKen();
		  loginTC = new LoginTC();
		  accesarMDR = new AcessarMDRPO();
		  livrosFiscaisExcluirEmMassaPO = new LivrosFiscaisExcluirEmMassaPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }

	  
	  @Test()
	  public void Criar() {
		  
		  loginTC.login();
		  accesarMDR.acessarMDR();
		  
		boolean sucesso = livrosFiscaisExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		
	  }
	  
	  @Test(dependsOnMethods = "Criar")
	  public void excluir() {
		  
		boolean sucesso2 = livrosFiscaisExcluirEmMassaPO.livrosFiscaisExcluirEmMassa();
		assertTrue(sucesso2, Eliminado);
	  }

}
