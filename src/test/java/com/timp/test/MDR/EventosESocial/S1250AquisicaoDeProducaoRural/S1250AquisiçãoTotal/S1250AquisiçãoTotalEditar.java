package com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250AquisiçãoTotal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250Aquisição.S1250AquisiçãoEditarPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250AquisiçãoTotal.S1250AquisiçãoTotalEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class S1250AquisiçãoTotalEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S1250AquisiçãoTotalEditarPO s1250AquisiçãoTotalEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s1250AquisiçãoTotalEditarPO = new S1250AquisiçãoTotalEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void editar() {
		
		loginTC.login();
		
		acessarMDRPO.acessarMDR();

		boolean sucesso = s1250AquisiçãoTotalEditarPO.editar();

		assertTrue(sucesso, Editar);

	}

}
