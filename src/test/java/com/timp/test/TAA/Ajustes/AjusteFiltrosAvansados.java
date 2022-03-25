package com.timp.test.TAA.Ajustes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.Ajuste.AjusteFiltrosAvansadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class AjusteFiltrosAvansados extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;
	AjusteFiltrosAvansadosPO ajusteFiltrosAvansadosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		ajusteFiltrosAvansadosPO = new AjusteFiltrosAvansadosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtroAv() {
		loginTC.login();
		acessarTAAPO.acessarTAA();
		ajusteFiltrosAvansadosPO.Filtros();

		ArrayList<Boolean> cAjuste = ajusteFiltrosAvansadosPO.CodigoAjuste();
		for (int i = 0; i < cAjuste.size(); i++) {
			assertTrue(cAjuste.get(i), Filtros);
		}

		ArrayList<Boolean> status = ajusteFiltrosAvansadosPO.status();
		for (int i = 0; i < status.size(); i++) {
			assertTrue(status.get(i), Filtros);
		}

		ArrayList<Boolean> usuarioModificado = ajusteFiltrosAvansadosPO.usuarioModificado();
		for (int i = 0; i < usuarioModificado.size(); i++) {
			assertTrue(usuarioModificado.get(i), Filtros);
		}

		ArrayList<Boolean> empresa = ajusteFiltrosAvansadosPO.Empresa();
		for (int i = 0; i < empresa.size(); i++) {
			assertTrue(empresa.get(i), Filtros);
		}

		/*
		 * ArrayList<Boolean> subPeriodo = ajusteFiltrosAvansadosPO .subPeriodo(); for
		 * (int i = 0; i < subPeriodo .size(); i++) { assertTrue(subPeriodo .get(i),
		 * Filtros); }
		 */

		/*
		 * ArrayList<Boolean> dataModificado = ajusteFiltrosAvansadosPO
		 * .dataModificado(); for (int i = 0; i < dataModificado .size(); i++) {
		 * assertTrue(dataModificado.get(i), Filtros); }
		 */

		ArrayList<Boolean> UF = ajusteFiltrosAvansadosPO.UF();
		for (int i = 0; i < UF.size(); i++) {
			assertTrue(UF.get(i), Filtros);
		}

		ArrayList<Boolean> usuarioCriado = ajusteFiltrosAvansadosPO.usuarioCriado();
		for (int i = 0; i < usuarioCriado.size(); i++) {
			assertTrue(usuarioCriado.get(i), Filtros);
		}

		ArrayList<Boolean> codigoAjusteAssociacao = ajusteFiltrosAvansadosPO.codigoAjusteAssociacao();
		for (int i = 0; i < codigoAjusteAssociacao.size(); i++) {
			assertTrue(codigoAjusteAssociacao.get(i), Filtros);
		}

		ArrayList<Boolean> filial = ajusteFiltrosAvansadosPO.filial();
		for (int i = 0; i < filial.size(); i++) {
			assertTrue(filial.get(i), Filtros);
		}

		/*
		 * ArrayList<Boolean> dataCriado = ajusteFiltrosAvansadosPO .dataCriado(); for
		 * (int i = 0; i <dataCriado.size(); i++) { assertTrue(dataCriado.get(i),
		 * Filtros); }
		 */
	}

}
