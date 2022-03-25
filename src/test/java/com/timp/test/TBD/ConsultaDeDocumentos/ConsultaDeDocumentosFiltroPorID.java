package com.timp.test.TBD.ConsultaDeDocumentos;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;
import com.sap.timp.pageObjectModel.TBD.ConsultaDeDocumentos.ConsultaDeDocumentosFiltroPorIDPO;

public class ConsultaDeDocumentosFiltroPorID extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTBDPO acessarTBDPO;
	ConsultaDeDocumentosFiltroPorIDPO consultaDeDocumentosFiltroPorIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTBDPO = new AcessarTBDPO();
		consultaDeDocumentosFiltroPorIDPO = new ConsultaDeDocumentosFiltroPorIDPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}

	

	@Test()
	public void filtro() {
		loginTC.login();
		acessarTBDPO.acessarTBD();
		ArrayList<Boolean> sucesso = consultaDeDocumentosFiltroPorIDPO.filtro();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}
		sleep(3000);
	}

}
