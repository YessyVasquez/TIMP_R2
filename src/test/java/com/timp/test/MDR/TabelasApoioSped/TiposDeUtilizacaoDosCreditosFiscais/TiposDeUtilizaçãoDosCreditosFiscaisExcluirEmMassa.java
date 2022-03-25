package com.timp.test.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais.TiposDeUtilizaçãoDosCreditosFiscaisExcluirEmMassaPO;

public class TiposDeUtilizaçãoDosCreditosFiscaisExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TiposDeUtilizaçãoDosCreditosFiscaisExcluirEmMassaPO tiposDeUtilizaçãoDosCreditosFiscaisExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tiposDeUtilizaçãoDosCreditosFiscaisExcluirEmMassaPO = new TiposDeUtilizaçãoDosCreditosFiscaisExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = tiposDeUtilizaçãoDosCreditosFiscaisExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = tiposDeUtilizaçãoDosCreditosFiscaisExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}
