package com.timp.test.MDR.CodigoReceita;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CEP.Bairro.BairroCriarPO;
import com.sap.timp.pageObjectModel.MDR.CodigoReceita.CodigoReceitaCriarPO;
import com.sap.timp.pageObjectModel.MDR.CodigoReceita.CodigoReceitaDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.LimiteCompetencia.LimiteCompetenciaCriarPO;

public class CodigoReceitaDetalhes extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoReceitaDetalhesPO codigoReceitaDetalhesPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoReceitaDetalhesPO = new CodigoReceitaDetalhesPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void detalhes() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();


		ArrayList<Boolean> sucesso = codigoReceitaDetalhesPO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}

	}
}
