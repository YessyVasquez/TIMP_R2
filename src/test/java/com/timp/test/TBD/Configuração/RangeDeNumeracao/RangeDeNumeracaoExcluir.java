package com.timp.test.TBD.Configuração.RangeDeNumeracao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;
import com.sap.timp.pageObjectModel.TBD.Configuracao.RangeDeNumeracao.RangeDeNumeracaoExcluirPO;

public class RangeDeNumeracaoExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTBDPO acessarTBDPO;
	RangeDeNumeracaoExcluirPO rangeDeNumeracaoExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTBDPO = new AcessarTBDPO();
		rangeDeNumeracaoExcluirPO = new RangeDeNumeracaoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void excluir() {
		loginTC.login();
		acessarTBDPO.acessarTBD();
		boolean sucesso = rangeDeNumeracaoExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
		sleep(3000);
	}

}
