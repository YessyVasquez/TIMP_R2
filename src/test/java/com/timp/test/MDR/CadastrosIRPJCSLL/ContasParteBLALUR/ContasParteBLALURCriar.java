package com.timp.test.MDR.CadastrosIRPJCSLL.ContasParteBLALUR;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroDerex.CadastroResponsavel.*;
import com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.ContasParteBLALUR.ContasParteBLALURCriarPO;

public class ContasParteBLALURCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ContasParteBLALURCriarPO contasParteBLALURCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		contasParteBLALURCriarPO = new ContasParteBLALURCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = contasParteBLALURCriarPO.criar();

		assertTrue(sucesso, Criar);
		sleep(2000);

	}

}
