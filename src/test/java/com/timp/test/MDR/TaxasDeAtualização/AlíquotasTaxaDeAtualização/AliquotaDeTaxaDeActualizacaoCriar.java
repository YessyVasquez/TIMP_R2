package com.timp.test.MDR.TaxasDeAtualização.AlíquotasTaxaDeAtualização;

import org.testng.annotations.Test;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela15.AgenteCausadorDeSGDPCriarPO;
import com.sap.timp.pageObjectModel.MDR.TaxasDeActualizacao.AliquotasDeTaxaDeActualizacaoCriarPO;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.AfterClass;

public class AliquotaDeTaxaDeActualizacaoCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AliquotasDeTaxaDeActualizacaoCriarPO aliquotasDeTaxaDeActualizacaoCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		aliquotasDeTaxaDeActualizacaoCriarPO = new AliquotasDeTaxaDeActualizacaoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();

	}

	@Test()
	public void criar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = aliquotasDeTaxaDeActualizacaoCriarPO.criar();

		assertTrue(sucesso, Criar);

	}
}
