package com.timp.test.MDR.Siscoserv.RegistroRAS;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRAS.RegistroRASExcluirPO;

public class RegistroRASExcluir extends TestBaseSteven{
 
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RegistroRASExcluirPO registroRASExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		registroRASExcluirPO = new RegistroRASExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = registroRASExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}
}
