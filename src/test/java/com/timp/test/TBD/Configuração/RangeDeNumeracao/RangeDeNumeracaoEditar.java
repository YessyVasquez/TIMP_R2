package com.timp.test.TBD.Configuração.RangeDeNumeracao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;
import com.sap.timp.pageObjectModel.TBD.Configuracao.RangeDeNumeracao.RangeDeNumeracaoEditarPO;

public class RangeDeNumeracaoEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTBDPO acessarTBDPO;
	RangeDeNumeracaoEditarPO rangeDeNumeracaoEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTBDPO = new AcessarTBDPO();
		rangeDeNumeracaoEditarPO = new RangeDeNumeracaoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void editar() {
		loginTC.login();
		acessarTBDPO.acessarTBD();
		boolean sucesso = rangeDeNumeracaoEditarPO.editar();
		assertTrue(sucesso, Editar);
		sleep(3000);
	}
}
