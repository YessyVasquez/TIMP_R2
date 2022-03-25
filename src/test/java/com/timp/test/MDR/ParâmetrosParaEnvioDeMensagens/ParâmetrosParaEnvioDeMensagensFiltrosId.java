package com.timp.test.MDR.ParâmetrosParaEnvioDeMensagens;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParâmetrosParaEnvioDeMensagens.ParâmetrosParaEnvioDeMensagensFiltroIdPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.remote.NewSessionPayload;
import org.testng.annotations.AfterClass;

public class ParâmetrosParaEnvioDeMensagensFiltrosId extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ParâmetrosParaEnvioDeMensagensFiltroIdPO parâmetrosParaEnvioDeMensagensFiltroIdPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		parâmetrosParaEnvioDeMensagensFiltroIdPO = new ParâmetrosParaEnvioDeMensagensFiltroIdPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void filtros() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		parâmetrosParaEnvioDeMensagensFiltroIdPO.filtro();
		// String sucesso = antecipacaoFiltrosPO.filtro();

		// assertEquals(sucesso, antecipacaoFiltrosPO.id.getText(), Filtros);

	}

}
