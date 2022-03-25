package com.timp.test.MDR.AtividadesFiscais.GrupoAtividadeFiscal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class GrupoAtividadeExcluirMassa extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	GrupoAtividadeExcluirMassaPO grupoAtividadeExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		grupoAtividadeExcluirMassaPO = new GrupoAtividadeExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void criar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();
		
		boolean sucesso = grupoAtividadeExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);
	}
	
	@Test(dependsOnMethods = "criar")
	public void excluirMassa() {
		boolean sucesso = grupoAtividadeExcluirMassaPO.exluirMassa();
		assertTrue(sucesso, Eliminado);
		sleep(2000);
	}
}
