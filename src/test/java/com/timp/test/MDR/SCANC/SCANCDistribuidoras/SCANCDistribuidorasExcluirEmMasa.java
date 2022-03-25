package com.timp.test.MDR.SCANC.SCANCDistribuidoras;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.SCANCDistribuidoras.SCANCDistribuidoraExcluirEmMassaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoExcluirMasaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela20.TiposDeLogradouroExcluirEmMasaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela27.CodigosDeLotacaoExcluirEmMasaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.UnidadeDeMedida.UnidadeDeMedidaExcluirEmMasaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class SCANCDistribuidorasExcluirEmMasa extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	SCANCDistribuidoraExcluirEmMassaPO scancDistribuidoraExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		scancDistribuidoraExcluirEmMassaPO = new SCANCDistribuidoraExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void Criar() {

		loginTC.login();

		accesarMDR.acessarMDR();

		boolean sucesso = scancDistribuidoraExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);

	}

	@Test(dependsOnMethods = "Criar")
	public void excluirMassa() {

		boolean sucesso2 = scancDistribuidoraExcluirEmMassaPO.excluirMassa();
		assertTrue(sucesso2, Eliminado);

	}

}
