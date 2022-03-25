package com.timp.test.MDR.TaxasDeAtualização.AlíquotasTaxaDeAtualização;

import org.testng.annotations.Test;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoContribuiçaoSocialApurada.CodigoContribuiçaoSocialApuradaDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.TaxasDeActualizacao.AliquotasDeTaxaActualizarDetalhesPO;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertTrue;
import java.util.ArrayList;
import org.testng.annotations.AfterClass;

public class AliquotaDeTaxaDeActualizacaoDetalhes extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AliquotasDeTaxaActualizarDetalhesPO aliquotasDeTaxaActualizarDetalhesPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		aliquotasDeTaxaActualizarDetalhesPO = new AliquotasDeTaxaActualizarDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void detalhes() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = aliquotasDeTaxaActualizarDetalhesPO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {

			assertTrue(sucesso.get(i), Detalhes);
		}
	}

}
