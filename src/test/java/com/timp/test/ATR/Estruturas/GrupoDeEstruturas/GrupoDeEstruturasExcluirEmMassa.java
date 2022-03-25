package com.timp.test.ATR.Estruturas.GrupoDeEstruturas;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.GrupoDeEstruturas.GrupoDeEstruturasExcluirEmMassaPO;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;

public class GrupoDeEstruturasExcluirEmMassa extends TestBaseSteven{
	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	GrupoDeEstruturasExcluirEmMassaPO grupoDeEstruturasExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarATRPO = new AcessarATRPO();
		grupoDeEstruturasExcluirEmMassaPO = new GrupoDeEstruturasExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	

	@Test()
	public void criar() {
		
		loginTC.login();
 		
		 acessarATRPO.acessarATR();

		boolean sucesso = grupoDeEstruturasExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);
		
	}
	
	@Test(dependsOnMethods = "criar" )
	public void Excluir () {
		
		
		sleep(1000);
		boolean sucesso2 = grupoDeEstruturasExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);
		sleep(2000);

	}
 
}
