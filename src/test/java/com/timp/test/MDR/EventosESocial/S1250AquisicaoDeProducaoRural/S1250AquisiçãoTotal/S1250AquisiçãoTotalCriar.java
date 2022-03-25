package com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250AquisiçãoTotal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250AquisiçãoTotal.S1250AquisiçãoTotalCriarPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetAquisição.S1250DetAquisiçãoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class S1250AquisiçãoTotalCriar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S1250AquisiçãoTotalCriarPO s1250AquisiçãoTotalCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s1250AquisiçãoTotalCriarPO = new S1250AquisiçãoTotalCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	
	@Test()
	public void criar() {
		
		loginTC.login();
		
		acessarMDRPO.acessarMDR();

		boolean sucesso = s1250AquisiçãoTotalCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
