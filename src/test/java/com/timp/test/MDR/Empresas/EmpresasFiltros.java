package com.timp.test.MDR.Empresas;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Empresas.EmpresasFiltrosPO;

public class EmpresasFiltros extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	EmpresasFiltrosPO empresasFiltrosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		empresasFiltrosPO = new EmpresasFiltrosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtros() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = empresasFiltrosPO.razaoSocial();
		sleep(2000);
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "The results in the filter aren't equal");
		}

		ArrayList<Boolean> sucesso2 = empresasFiltrosPO.municipio();
		sleep(2000);
		for (int i = 0; i < sucesso2.size(); i++) {
			assertTrue(sucesso2.get(i), "The results in the filter aren't equal");
		}

		ArrayList<Boolean> sucesso3 = empresasFiltrosPO.dataFinal();
		sleep(2000);
		for (int i = 0; i < sucesso3.size(); i++) {
			assertTrue(sucesso3.get(i), "The results in the filter aren't equal");
		}

	}

}
