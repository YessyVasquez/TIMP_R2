package com.timp.test.MDR.MapeamentoDeRelevanciaParaPisCofins;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.MapeamentoDeRelevanciaParaPisCofins.MapeamentoDeRelevanciaParaPisCofinsExcluirPO;

public class MapeamentoDeRelevanciaParaPisCofinsExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MapeamentoDeRelevanciaParaPisCofinsExcluirPO mapeamentoDeRelevanciaParaPisCofinsExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		mapeamentoDeRelevanciaParaPisCofinsExcluirPO = new MapeamentoDeRelevanciaParaPisCofinsExcluirPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = mapeamentoDeRelevanciaParaPisCofinsExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
