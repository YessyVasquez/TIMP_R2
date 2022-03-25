package com.timp.test.MDR.EventosESocial.S1060AmbientesDeTrablho;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1060AmbientesDeTrablho.S1060AmbientesDeTrabalhoFiltroIdPO;

public class S1060AmbientesDeTrabalhoFiltroID extends TestBaseSteven {
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S1060AmbientesDeTrabalhoFiltroIdPO s1060AmbientesDeTrabalhoFiltroIdPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s1060AmbientesDeTrabalhoFiltroIdPO = new S1060AmbientesDeTrabalhoFiltroIdPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtro() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = s1060AmbientesDeTrabalhoFiltroIdPO.filtro();
		assertTrue(sucesso, Filtros);
	}
		
		
}
