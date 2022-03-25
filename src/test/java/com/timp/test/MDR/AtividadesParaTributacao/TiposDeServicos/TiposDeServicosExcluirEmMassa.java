package com.timp.test.MDR.AtividadesParaTributacao.TiposDeServicos;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesParaTributacao.TiposDeServicos.TiposDeServicosExcluirEmMassaPO;

public class TiposDeServicosExcluirEmMassa extends TestBaseSteven{
 
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TiposDeServicosExcluirEmMassaPO tiposDeServicosExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tiposDeServicosExcluirEmMassaPO = new TiposDeServicosExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {		
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = tiposDeServicosExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
	}
	
	
	@Test(dependsOnMethods = "criar")
	public void excluir() {
		boolean sucesso2 = tiposDeServicosExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);
		sleep(2000);
	}
}
