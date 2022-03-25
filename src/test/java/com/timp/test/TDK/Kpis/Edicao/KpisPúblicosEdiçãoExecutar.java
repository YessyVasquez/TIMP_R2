package com.timp.test.TDK.Kpis.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.Edicao.KpisCartaoIndicadorEditarPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.Edicao.KpisPúblicosEdiçãoExecutarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class KpisPúblicosEdiçãoExecutar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisPúblicosEdiçãoExecutarPO kpisPúblicosEdiçãoExecutarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisPúblicosEdiçãoExecutarPO = new KpisPúblicosEdiçãoExecutarPO();
	}
	
	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void executar() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		boolean sucesso = kpisPúblicosEdiçãoExecutarPO.Grafico();
		assertTrue(sucesso, Editar);
	}
}
