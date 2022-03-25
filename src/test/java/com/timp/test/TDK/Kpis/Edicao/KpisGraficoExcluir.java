package com.timp.test.TDK.Kpis.Edicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.Edicao.kpisGraficoExcluirPO;

public class KpisGraficoExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	kpisGraficoExcluirPO kpisGraficoExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisGraficoExcluirPO = new kpisGraficoExcluirPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void grafico() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		boolean sucesso = kpisGraficoExcluirPO.GraficoExcluir();
		assertTrue(sucesso, "O Grafico  não foi excluido");
	}
}
