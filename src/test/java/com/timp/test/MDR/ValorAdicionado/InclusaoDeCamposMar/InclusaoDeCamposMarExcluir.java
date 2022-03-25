package com.timp.test.MDR.ValorAdicionado.InclusaoDeCamposMar;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ValorAdicionado.InclusaoDeCamposMar.InclusaoDeCamposMarExcluirPO;

public class InclusaoDeCamposMarExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	InclusaoDeCamposMarExcluirPO inclusaoDeCamposMarExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		inclusaoDeCamposMarExcluirPO = new InclusaoDeCamposMarExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void Excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = inclusaoDeCamposMarExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
	}

}
