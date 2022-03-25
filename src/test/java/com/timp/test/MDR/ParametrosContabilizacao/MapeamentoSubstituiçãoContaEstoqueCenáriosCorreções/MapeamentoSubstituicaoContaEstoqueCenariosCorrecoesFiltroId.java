package com.timp.test.MDR.ParametrosContabilizacao.MapeamentoSubstituiçãoContaEstoqueCenáriosCorreções;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo.DetalheCriarPO;
import com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo.DetalheFiltroIdPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoes.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesFiltroIdPO;

public class MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesFiltroId extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesFiltroIdPO mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesFiltroIdPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesFiltroIdPO = new MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesFiltroIdPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtroId() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesFiltroIdPO.filtro();

		assertTrue(sucesso, Filtros);

	}
}
