package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeOutrasSaidas;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeOutrasSaidas.CodigoDeOutrasSaidasExcluirPO;

public class CodigoDeOutrasSaidasExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoDeOutrasSaidasExcluirPO codigoDeOutrasSaidasExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoDeOutrasSaidasExcluirPO = new CodigoDeOutrasSaidasExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = codigoDeOutrasSaidasExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
