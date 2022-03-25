package com.timp.test.TFP.Configurações.Bloqueios.Periodo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configurações.Bloqueios.Periodo.ConfiguracaoBloqueiosCriarPO;

public class ConfiguracaoBloqueiosCriar extends TestBaseFernando {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	ConfiguracaoBloqueiosCriarPO configuracaoBloqueiosCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		configuracaoBloqueiosCriarPO = new ConfiguracaoBloqueiosCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarTFPPO.acessarTFP();
		boolean sucesso = configuracaoBloqueiosCriarPO.criar();
		assertTrue(sucesso, Criar);
		sleep(3000);
	}
}
