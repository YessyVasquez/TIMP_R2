package com.timp.test.MDR.AtividadesParaTributacao.TiposDeServicos;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesParaTributacao.TiposDeServicos.TiposDeServicosExcluirPO;

public class TiposDeServicosExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TiposDeServicosExcluirPO tiposDeServicosExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tiposDeServicosExcluirPO = new TiposDeServicosExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = tiposDeServicosExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
		sleep(2000);
	}

}
