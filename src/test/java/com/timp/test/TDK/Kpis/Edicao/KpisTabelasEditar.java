package com.timp.test.TDK.Kpis.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.Edicao.KpisTabelasEditarPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.Edicao.KpisTabelasPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class KpisTabelasEditar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisTabelasEditarPO kpisTabelasEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisTabelasEditarPO = new KpisTabelasEditarPO();

	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void Editar() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		boolean sucesso = kpisTabelasEditarPO.tabelas();
		assertTrue(sucesso, "Tabela não criada");
	}
}
