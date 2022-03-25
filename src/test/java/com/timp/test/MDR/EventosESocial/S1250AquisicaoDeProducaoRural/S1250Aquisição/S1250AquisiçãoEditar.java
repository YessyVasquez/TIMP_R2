package com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250Aquisição;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250Aquisição.S1250AquisiçãoEditarPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DadosdeEvento.S1250DadosdeEventoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class S1250AquisiçãoEditar extends TestBaseSteven{

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S1250AquisiçãoEditarPO s1250AquisiçãoEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s1250AquisiçãoEditarPO = new S1250AquisiçãoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void editar() {
		
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = s1250AquisiçãoEditarPO.editar();

		assertTrue(sucesso, Editar);

	}
}
