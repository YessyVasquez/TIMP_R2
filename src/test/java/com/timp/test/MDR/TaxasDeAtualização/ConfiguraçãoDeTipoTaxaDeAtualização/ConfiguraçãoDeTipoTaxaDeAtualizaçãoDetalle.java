package com.timp.test.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualizaçãoDetallesPO;

public class ConfiguraçãoDeTipoTaxaDeAtualizaçãoDetalle extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	ConfiguraçãoDeTipoTaxaDeAtualizaçãoDetallesPO configuraçãoDeTipoTaxaDeAtualizaçãoDetallePO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		configuraçãoDeTipoTaxaDeAtualizaçãoDetallePO = new ConfiguraçãoDeTipoTaxaDeAtualizaçãoDetallesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void detalle() {

		loginTC.login();
		accesarMDRPO.acessarMDR();
		ArrayList<Boolean> sucesso = configuraçãoDeTipoTaxaDeAtualizaçãoDetallePO.Detalle();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}

}
