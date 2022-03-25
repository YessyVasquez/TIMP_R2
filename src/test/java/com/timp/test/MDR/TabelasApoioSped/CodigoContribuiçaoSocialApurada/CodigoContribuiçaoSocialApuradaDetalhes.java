package com.timp.test.MDR.TabelasApoioSped.CodigoContribuiçaoSocialApurada;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoContribuiçaoSocialApurada.CodigoContribuiçaoSocialApuradaDetalhesPO;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

public class CodigoContribuiçaoSocialApuradaDetalhes extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoContribuiçaoSocialApuradaDetalhesPO CodigoContribuiçaoSocialApuradaDetalhesPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		CodigoContribuiçaoSocialApuradaDetalhesPO = new CodigoContribuiçaoSocialApuradaDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void detalhes() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		ArrayList<Boolean> sucesso = CodigoContribuiçaoSocialApuradaDetalhesPO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {

			assertTrue(sucesso.get(i), Detalhes);
		}
	}

}
