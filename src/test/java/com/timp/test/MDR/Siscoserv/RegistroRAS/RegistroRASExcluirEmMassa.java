package com.timp.test.MDR.Siscoserv.RegistroRAS;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRAS.RegistroRASExcluirEmMassaPO;

public class RegistroRASExcluirEmMassa extends TestBaseSteven{
 
	
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RegistroRASExcluirEmMassaPO registroRASExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		registroRASExcluirEmMassaPO = new RegistroRASExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	
	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = registroRASExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);

		sleep(1000);
	}
	
	@Test(dependsOnMethods = "criar")
	public void excluir() {
		boolean sucesso2 = registroRASExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);
	}
}
