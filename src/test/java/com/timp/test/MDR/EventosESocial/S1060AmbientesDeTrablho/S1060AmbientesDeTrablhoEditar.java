package com.timp.test.MDR.EventosESocial.S1060AmbientesDeTrablho;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1060AmbientesDeTrablho.S1060AmbientesDeTrablhoEditarPO;

public class S1060AmbientesDeTrablhoEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S1060AmbientesDeTrablhoEditarPO s1060AmbientesDeTrablhoEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s1060AmbientesDeTrablhoEditarPO = new S1060AmbientesDeTrablhoEditarPO();
	}

	 @AfterClass public void afterClass() {
		 driver.close(); 		 
	 }

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = s1060AmbientesDeTrablhoEditarPO.editar();
		assertTrue(sucesso, Editar);

	}

}
