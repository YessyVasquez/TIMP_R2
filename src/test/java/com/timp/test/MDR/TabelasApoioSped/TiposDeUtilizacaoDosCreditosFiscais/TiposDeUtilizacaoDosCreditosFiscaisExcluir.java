package com.timp.test.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais.TiposDeUtilizacaoDosCreditosFiscaisExcluirPO;

public class TiposDeUtilizacaoDosCreditosFiscaisExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TiposDeUtilizacaoDosCreditosFiscaisExcluirPO tiposDeUtilizacaoDosCreditosFiscaisExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tiposDeUtilizacaoDosCreditosFiscaisExcluirPO = new TiposDeUtilizacaoDosCreditosFiscaisExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = tiposDeUtilizacaoDosCreditosFiscaisExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
