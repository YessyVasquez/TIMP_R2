package com.timp.test.MDR.CadastroCondiçao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroCondiçao.CadastroCondiçaoExcluirenMasasPO;
import com.sap.timp.pageObjectModel.MDR.HierarquiaDeCenariosDeCorreçao.HierarquiaDeCenariosDeCorreçaoExcluirMasasPO;

public class CadastroCondiçaoExcluirMasas extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CadastroCondiçaoExcluirenMasasPO cadastroCondiçaoExcluirenMasasPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		cadastroCondiçaoExcluirenMasasPO = new CadastroCondiçaoExcluirenMasasPO();
	}

	@AfterClass
	public void afterClass() {

		//driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = cadastroCondiçaoExcluirenMasasPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);

	}
	
	@Test(dependsOnMethods = "criar")
	public void excluir() {

		boolean sucesso2 = cadastroCondiçaoExcluirenMasasPO.HierarquiaDeCenariosDeCorreçaoExcluirMasas();
		assertTrue(sucesso2, Eliminado);
		sleep(2000);
	}
	
}
