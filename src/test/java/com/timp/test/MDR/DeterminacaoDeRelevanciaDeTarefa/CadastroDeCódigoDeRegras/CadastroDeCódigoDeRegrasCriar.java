package com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.CadastroDeCódigoDeRegras;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoDeRelevanciaDeTarefa.CadastroDeCódigoDeRegras.CadastroDeCódigoDeRegrasCriarPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CadastroDeCódigoDeRegrasCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CadastroDeCódigoDeRegrasCriarPO cadastroDeCódigoDeRegrasCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		cadastroDeCódigoDeRegrasCriarPO = new CadastroDeCódigoDeRegrasCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}



	@Test()
	public void criar() {
		
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = cadastroDeCódigoDeRegrasCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
