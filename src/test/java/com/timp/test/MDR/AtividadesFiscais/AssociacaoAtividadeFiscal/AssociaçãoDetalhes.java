package com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class AssociaçãoDetalhes extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	AssociaçãoDetalhesPO associaçãoDetalhesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		associaçãoDetalhesPO = new AssociaçãoDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void detalheAssociação() {

		loginTC.login();

		accesarMDR.acessarMDR();

		ArrayList<Boolean> sucesso = associaçãoDetalhesPO.detalheAssociação();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "Ocurrio un error");
		}
		
		sleep(2000);
	}
}
