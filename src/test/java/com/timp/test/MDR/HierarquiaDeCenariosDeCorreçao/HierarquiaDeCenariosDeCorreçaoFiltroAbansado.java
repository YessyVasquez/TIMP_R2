package com.timp.test.MDR.HierarquiaDeCenariosDeCorreçao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.HierarquiaDeCenariosDeCorreçao.HierarquiaDeCenariosDeCorreçaoFiltrosAbansadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class HierarquiaDeCenariosDeCorreçaoFiltroAbansado extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	HierarquiaDeCenariosDeCorreçaoFiltrosAbansadosPO hierarquiaDeCenariosDeCorreçaoFiltrosAbansadosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM();
		accesarMDRPO = new AcessarMDRPO();
		loginTC = new LoginTC();
		hierarquiaDeCenariosDeCorreçaoFiltrosAbansadosPO = new HierarquiaDeCenariosDeCorreçaoFiltrosAbansadosPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void Filtro() {

		loginTC.login();

		accesarMDRPO.acessarMDR();

		ArrayList<Boolean> tributo = hierarquiaDeCenariosDeCorreçaoFiltrosAbansadosPO.filtroTributo();
		for (int i = 0; i < tributo.size(); i++) {
			assertTrue(tributo.get(i), Filtros);
		}

		ArrayList<Boolean> usuarioCriacao = hierarquiaDeCenariosDeCorreçaoFiltrosAbansadosPO.filtroUsuarioCriacao();
		for (int i = 0; i < usuarioCriacao.size(); i++) {
			assertTrue(usuarioCriacao.get(i), Filtros);
		}

		ArrayList<Boolean> dataCriacao = hierarquiaDeCenariosDeCorreçaoFiltrosAbansadosPO.filtroDataCriacao();
		for (int i = 0; i < dataCriacao.size(); i++) {
			assertTrue(dataCriacao.get(i), Filtros);
		}

		ArrayList<Boolean> usuarioModificado = hierarquiaDeCenariosDeCorreçaoFiltrosAbansadosPO
				.filtroUsuarioModificado();
		for (int i = 0; i < usuarioModificado.size(); i++) {
			assertTrue(usuarioModificado.get(i), Filtros);
		}

		ArrayList<Boolean> dataModificado = hierarquiaDeCenariosDeCorreçaoFiltrosAbansadosPO.filtroDataModificado();
		for (int i = 0; i < dataModificado.size(); i++) {
			assertTrue(dataModificado.get(i), Filtros);
		}

	}

}
