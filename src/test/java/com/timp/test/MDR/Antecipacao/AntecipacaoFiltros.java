package com.timp.test.MDR.Antecipacao;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoFiltrosPO;
import com.sap.timp.pageObjectModel.MDR.Filiais.FiliaisVisualizarPO;

public class AntecipacaoFiltros extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AntecipacaoFiltrosPO antecipacaoFiltrosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		antecipacaoFiltrosPO = new AntecipacaoFiltrosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtros() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		String sucesso = antecipacaoFiltrosPO.filtro();

		assertEquals(sucesso, antecipacaoFiltrosPO.id.getText(), Filtros);
		sleep(2000);
	}

}
