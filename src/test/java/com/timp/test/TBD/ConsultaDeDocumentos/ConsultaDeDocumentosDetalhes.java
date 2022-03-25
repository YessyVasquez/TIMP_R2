package com.timp.test.TBD.ConsultaDeDocumentos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;
import com.sap.timp.pageObjectModel.TBD.ConsultaDeDocumentos.ConsultaDeDocumentosDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConsultaDeDocumentosDetalhes extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTBDPO acessarTBDPO;
	ConsultaDeDocumentosDetalhesPO consultaDeDocumentosDetalhesPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM();
		loginTC = new LoginTC();
		acessarTBDPO = new AcessarTBDPO();
		consultaDeDocumentosDetalhesPO = new ConsultaDeDocumentosDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void detalle() {
		loginTC.login();
		acessarTBDPO.acessarTBD();
		ArrayList<Boolean> sucesso = consultaDeDocumentosDetalhesPO.detalles();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
		sleep(3000);
	}
}
