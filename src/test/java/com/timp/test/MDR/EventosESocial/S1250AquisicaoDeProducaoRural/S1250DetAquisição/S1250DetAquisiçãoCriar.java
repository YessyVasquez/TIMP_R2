package com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetAquisição;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250Aquisição.S1250AquisiçãoCriarPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetAquisição.S1250DetAquisiçãoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class S1250DetAquisiçãoCriar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S1250DetAquisiçãoCriarPO s1250DetAquisiçãoCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s1250DetAquisiçãoCriarPO = new S1250DetAquisiçãoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();
		
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = s1250DetAquisiçãoCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
