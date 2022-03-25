package com.timp.test.MDR.TaxasDeAtualização.AlíquotasTaxaDeAtualização;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela15.AgenteCausadorDeSGDPExcluirPO;
import com.sap.timp.pageObjectModel.MDR.TaxasDeActualizacao.AliquotaDeTaxaDeActualizarExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AliquotaDeTaxaDeActualizacaoExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AliquotaDeTaxaDeActualizarExcluirPO aliquotaDeTaxaDeActualizarExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		aliquotaDeTaxaDeActualizarExcluirPO = new AliquotaDeTaxaDeActualizarExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();

	}

	@Test()
	public void excluir() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = aliquotaDeTaxaDeActualizarExcluirPO.excluir();

		assertTrue(sucesso, Editar);

	}

}
