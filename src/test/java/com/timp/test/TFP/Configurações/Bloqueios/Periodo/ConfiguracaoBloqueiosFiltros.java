package com.timp.test.TFP.Configurações.Bloqueios.Periodo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configurações.Bloqueios.Periodo.ConfiguracaoBloqueiosFiltrosPO;

public class ConfiguracaoBloqueiosFiltros extends TestBaseFernando {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	ConfiguracaoBloqueiosFiltrosPO configuracaoBloqueiosFiltrosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		configuracaoBloqueiosFiltrosPO = new ConfiguracaoBloqueiosFiltrosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void filtros() {
		loginTC.login();
		acessarTFPPO.acessarTFP();
		boolean sucesso = configuracaoBloqueiosFiltrosPO.filtros();
		assertTrue(sucesso, Criar);
		sleep(3000);
	}
}
