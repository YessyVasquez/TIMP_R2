package com.timp.test.MDR.LimiteCompetencia;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LimiteCompetencia.LimiteCompetenciaFiltrosAvansadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class LimiteCompetenciaFiltrosAvansados extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	LimiteCompetenciaFiltrosAvansadosPO limiteCompetenciaFiltrosAvansadosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		accesarMDRPO = new AcessarMDRPO();
		loginTC = new LoginTC();
		limiteCompetenciaFiltrosAvansadosPO = new LimiteCompetenciaFiltrosAvansadosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void Filtro() {

		loginTC.login();

		accesarMDRPO.acessarMDR();

		limiteCompetenciaFiltrosAvansadosPO.Filtros();
		limiteCompetenciaFiltrosAvansadosPO.Filtros1();
		limiteCompetenciaFiltrosAvansadosPO.Filtros2();
		limiteCompetenciaFiltrosAvansadosPO.Filtros3();
		limiteCompetenciaFiltrosAvansadosPO.Filtros4();

		ArrayList<Boolean> empresa = limiteCompetenciaFiltrosAvansadosPO.Empresa();
		for (int i = 0; i < empresa.size(); i++) {
			assertTrue(empresa.get(i), Filtros);
		}

		// ArrayList<Boolean> uf = limiteCompetenciaFiltrosAvansadosPO.Uf();
		// for (int i = 0; i < uf.size(); i++) {
		// assertTrue(uf.get(i), Filtros);
		// }

		// ArrayList<Boolean> filial = limiteCompetenciaFiltrosAvansadosPO.Filial();
		// for (int i = 0; i < filial.size(); i++) {
		// assertTrue(filial.get(i), Filtros);
		// }

		ArrayList<Boolean> tributo = limiteCompetenciaFiltrosAvansadosPO.Tributo();
		for (int i = 0; i < tributo.size(); i++) {
			assertTrue(tributo.get(i), Filtros);
		}

		ArrayList<Boolean> nivel = limiteCompetenciaFiltrosAvansadosPO.Nivel();
		for (int i = 0; i < nivel.size(); i++) {
			assertTrue(nivel.get(i), Filtros);
		}
	}

}
