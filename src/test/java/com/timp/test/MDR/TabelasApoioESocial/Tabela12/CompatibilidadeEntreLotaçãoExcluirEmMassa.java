package com.timp.test.MDR.TabelasApoioESocial.Tabela12;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela12.CompatibilidadeEntreLotaçãoExcluirEmMassaPO;

public class CompatibilidadeEntreLotaçãoExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CompatibilidadeEntreLotaçãoExcluirEmMassaPO compatibilidadeEntreLotaçãoExcluirEmMassa;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		compatibilidadeEntreLotaçãoExcluirEmMassa = new CompatibilidadeEntreLotaçãoExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = compatibilidadeEntreLotaçãoExcluirEmMassa.criar();
		assertTrue(sucesso, Criar);
	}

	@Test(dependsOnMethods = "criar")
	public void excluirEmMassa() {
		boolean sucesso2 = compatibilidadeEntreLotaçãoExcluirEmMassa.excluir();
		assertTrue(sucesso2, Eliminado);
	}

}
