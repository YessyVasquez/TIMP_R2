package com.timp.test.MDR.CadastrosIRPJCSLL.ContasParteBLALUR;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroDerex.CadastroResponsavel.*;
import com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.ContasParteBLALUR.ContasParteBLALURExcluirPO;

public class ContasParteBLALURExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ContasParteBLALURExcluirPO contasParteBLALURExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		contasParteBLALURExcluirPO = new ContasParteBLALURExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = contasParteBLALURExcluirPO.excluir();

		assertTrue(sucesso, Eliminado);
		sleep(2000);

	}

}
