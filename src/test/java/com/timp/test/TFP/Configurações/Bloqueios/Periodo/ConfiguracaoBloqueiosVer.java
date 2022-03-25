package com.timp.test.TFP.Configurações.Bloqueios.Periodo;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configurações.Bloqueios.Periodo.ConfiguracaoBloqueiosVerPO;

public class ConfiguracaoBloqueiosVer extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	ConfiguracaoBloqueiosVerPO configuracaoBloqueiosVerPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		configuracaoBloqueiosVerPO = new ConfiguracaoBloqueiosVerPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void ver() {
		
		loginTC.login();
		acessarTFPPO.acessarTFP();
		ArrayList<Boolean> sucesso = configuracaoBloqueiosVerPO.ver();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
		sleep(3000);
	}
}
