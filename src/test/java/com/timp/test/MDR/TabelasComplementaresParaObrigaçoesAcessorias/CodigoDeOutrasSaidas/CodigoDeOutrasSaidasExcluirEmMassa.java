package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeOutrasSaidas;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.CodigoDeOutrasSaidas.CodigoDeOutrasSaidasExcluirEmMassaPO;

public class CodigoDeOutrasSaidasExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoDeOutrasSaidasExcluirEmMassaPO codigoDeOutrasSaidasExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoDeOutrasSaidasExcluirEmMassaPO = new CodigoDeOutrasSaidasExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 2)
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = codigoDeOutrasSaidasExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = codigoDeOutrasSaidasExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}
