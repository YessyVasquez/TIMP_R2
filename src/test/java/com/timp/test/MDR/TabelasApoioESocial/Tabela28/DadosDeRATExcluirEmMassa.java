package com.timp.test.MDR.TabelasApoioESocial.Tabela28;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRVS.RegistroRVSExcluirEmMassaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela28.DadosDeRATExcluirEmMassaPO;

public class DadosDeRATExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DadosDeRATExcluirEmMassaPO dadosDeRATExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		dadosDeRATExcluirEmMassaPO = new DadosDeRATExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = dadosDeRATExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);

	}

	@Test(dependsOnMethods = "criar")
	public void excluir() {

		sleep(1000);
		boolean sucesso2 = dadosDeRATExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}
}
