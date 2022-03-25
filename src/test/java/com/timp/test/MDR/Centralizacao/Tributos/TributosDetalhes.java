package com.timp.test.MDR.Centralizacao.Tributos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.Tributos.TributosDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;

public class TributosDetalhes extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TributosDetalhesPO tributosDetalhesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tributosDetalhesPO = new TributosDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void detalhes() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		String sucesso = tributosDetalhesPO.tributoDetalhes();
		assertEquals(sucesso, "detail", Filtros);
		sleep(2000);
	}
}
