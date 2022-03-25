package com.timp.test.TBD.Configuração.RangeDeNumeracao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;
import com.sap.timp.pageObjectModel.TBD.Configuracao.RangeDeNumeracao.RangeDeNumeracaoCriarPO;

public class RangeDeNumeracaoCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTBDPO acessarTBDPO;
	RangeDeNumeracaoCriarPO rangeDeNumeracaoCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTBDPO = new AcessarTBDPO();
		rangeDeNumeracaoCriarPO = new RangeDeNumeracaoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	
	@Test()
	public void criar() {
		loginTC.login();
		acessarTBDPO.acessarTBD();
		boolean sucesso = rangeDeNumeracaoCriarPO.criar();
		assertTrue(sucesso, Criar);
		sleep(3000);

	}

}
