package com.timp.test.MDR.DeterminacaoAutomaticaDeGuias;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoAutomaticaDeGuias.DeterminacaoAutomaticaDeGuiasFiltroPorIdPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.CommoditieParaTP.CommoditieParaTPFiltroIDPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class DeterminacaoAutomaticaDeGuiasFiltroPorId extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeterminacaoAutomaticaDeGuiasFiltroPorIdPO determinacaoAutomaticaDeGuiasFiltroPorIdPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationKen();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		determinacaoAutomaticaDeGuiasFiltroPorIdPO = new DeterminacaoAutomaticaDeGuiasFiltroPorIdPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtro() {
		
		loginTC.login();
		acessarMDRPO.acessarMDR();


		ArrayList<Boolean> sucesso = determinacaoAutomaticaDeGuiasFiltroPorIdPO.filtro();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}

	}

}
