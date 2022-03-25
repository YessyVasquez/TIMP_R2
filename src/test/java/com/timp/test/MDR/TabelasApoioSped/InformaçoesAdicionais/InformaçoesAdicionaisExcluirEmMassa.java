package com.timp.test.MDR.TabelasApoioSped.InformaçoesAdicionais;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.InformaçoesAdicionais.InformaçoesAdicionaisExcluirEmMassaPO;

public class InformaçoesAdicionaisExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	InformaçoesAdicionaisExcluirEmMassaPO informaçoesAdicionaisExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		informaçoesAdicionaisExcluirEmMassaPO = new InformaçoesAdicionaisExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = informaçoesAdicionaisExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = informaçoesAdicionaisExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}
