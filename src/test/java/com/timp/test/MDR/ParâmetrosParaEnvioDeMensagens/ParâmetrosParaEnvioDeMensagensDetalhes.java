package com.timp.test.MDR.ParâmetrosParaEnvioDeMensagens;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParâmetrosParaEnvioDeMensagens.ParâmetrosParaEnvioDeMensagensDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParâmetrosParaEnvioDeMensagensDetalhes extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	ParâmetrosParaEnvioDeMensagensDetalhesPO parâmetrosParaEnvioDeMensagensDetalhesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		parâmetrosParaEnvioDeMensagensDetalhesPO = new ParâmetrosParaEnvioDeMensagensDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void detalhes() {

		loginTC.login();
		accesarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = parâmetrosParaEnvioDeMensagensDetalhesPO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}
}
