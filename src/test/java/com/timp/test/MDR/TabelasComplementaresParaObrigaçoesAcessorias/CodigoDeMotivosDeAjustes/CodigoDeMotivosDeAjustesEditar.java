package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeMotivosDeAjustes;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeMotivosDeAjustes.CodigoDeMotivosDeAjustesEditarPO;

public class CodigoDeMotivosDeAjustesEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoDeMotivosDeAjustesEditarPO codigoDeMotivosDeAjustesEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoDeMotivosDeAjustesEditarPO = new CodigoDeMotivosDeAjustesEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = codigoDeMotivosDeAjustesEditarPO.editar();

		assertTrue(sucesso, Editar);

	}

}
