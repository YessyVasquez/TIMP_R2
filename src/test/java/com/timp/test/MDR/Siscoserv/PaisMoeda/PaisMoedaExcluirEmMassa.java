package com.timp.test.MDR.Siscoserv.PaisMoeda;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.PaisMoeda.PaisMoedaExcluirEmMassaPO;

public class PaisMoedaExcluirEmMassa extends TestBaseSteven{

	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	PaisMoedaExcluirEmMassaPO paisMoedaExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		paisMoedaExcluirEmMassaPO = new PaisMoedaExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	
	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = paisMoedaExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
	}
	
	
	@Test(dependsOnMethods = "criar")
	public void excluir() {
		boolean sucesso2 = paisMoedaExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);
	}
}
