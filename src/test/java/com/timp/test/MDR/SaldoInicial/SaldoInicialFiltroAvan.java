package com.timp.test.MDR.SaldoInicial;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SaldoInicial.SaldoInicialFiltroAvanPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class SaldoInicialFiltroAvan extends TestBaseKenssy {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	SaldoInicialFiltroAvanPO saldoInicialFiltroAvanPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationKen();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		saldoInicialFiltroAvanPO = new SaldoInicialFiltroAvanPO();

	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void FiltrarAvanSaldoIncial() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> empresa = saldoInicialFiltroAvanPO.filtroEmpresa();
		for (int i = 0; i < empresa.size(); i++) {
			assertTrue(empresa.get(i), Filtros);
		}

		ArrayList<Boolean> filial = saldoInicialFiltroAvanPO.filtroFilial();
		for (int i = 0; i < filial.size(); i++) {
			assertTrue(filial.get(i), Filtros);
		}

		ArrayList<Boolean> tributo = saldoInicialFiltroAvanPO.filtroTributo();
		for (int i = 0; i < tributo.size(); i++) {
			assertTrue(tributo.get(i), Filtros);
		}

		ArrayList<Boolean> data = saldoInicialFiltroAvanPO.filtroData();
		for (int i = 0; i < data.size(); i++) {
			assertTrue(data.get(i), Filtros);
		}

		ArrayList<Boolean> referencia = saldoInicialFiltroAvanPO.filtroReferencia();
		for (int i = 0; i < referencia.size(); i++) {
			assertTrue(referencia.get(i), Filtros);
		}

		ArrayList<Boolean> dc = saldoInicialFiltroAvanPO.filtroDC();
		for (int i = 0; i < dc.size(); i++) {
			assertTrue(dc.get(i), Filtros);
		}

	}
}
