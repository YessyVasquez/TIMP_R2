package com.timp.test.MDR.OcorrenciaFiscal.TiposDeObjetosDeOcorrenciasFiscais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.OcorrenciaFiscal.TiposDeObjetosDeOcorrenciasFiscais.TiposDeObjetosDeOcorrenciasFiscaisExcluirMassaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela15.AgenteCausadorDeSGDPExlusionMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TiposDeObjetosDeOcorrenciasFiscaisExcluirMassa extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TiposDeObjetosDeOcorrenciasFiscaisExcluirMassaPO tiposDeObjetosDeOcorrenciasFiscaisExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tiposDeObjetosDeOcorrenciasFiscaisExcluirMassaPO = new TiposDeObjetosDeOcorrenciasFiscaisExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void Criar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = tiposDeObjetosDeOcorrenciasFiscaisExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);

	}

	@Test(dependsOnMethods = "Criar")
	public void Excluir() {

		boolean sucesso2 = tiposDeObjetosDeOcorrenciasFiscaisExcluirMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}
}
