package com.timp.test.MDR.EventosESocial.S1060AmbientesDeTrablho;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1060AmbientesDeTrablho.S1060AmbientesDeTrablhoExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class S1060AmbientesDeTrablhoExcluirMassa extends TestBaseSteven{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S1060AmbientesDeTrablhoExcluirMassaPO s1060AmbientesDeTrablhoExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {
 
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s1060AmbientesDeTrablhoExcluirMassaPO = new S1060AmbientesDeTrablhoExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void criar() {		
		loginTC.login();		
		acessarMDRPO.acessarMDR();

		boolean sucesso = s1060AmbientesDeTrablhoExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);
	}
	
	@Test(dependsOnMethods = "criar")
	public void excluirEmMassa() {		
		sleep(1000);
	

	}
	
	@Test(dependsOnMethods = "criar")
	public void Excluir() {		
		
		boolean sucesso2 = s1060AmbientesDeTrablhoExcluirMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);
	}
}
