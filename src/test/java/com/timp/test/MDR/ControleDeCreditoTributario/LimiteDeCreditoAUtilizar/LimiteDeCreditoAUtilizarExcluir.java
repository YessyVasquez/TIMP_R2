package com.timp.test.MDR.ControleDeCreditoTributario.LimiteDeCreditoAUtilizar;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.LimiteDeCreditoAUtilizar.LimiteDeCreditoAUtilizarExcluirPO;

public class LimiteDeCreditoAUtilizarExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	LimiteDeCreditoAUtilizarExcluirPO limiteDeCreditoAUtilizarExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		limiteDeCreditoAUtilizarExcluirPO = new LimiteDeCreditoAUtilizarExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = limiteDeCreditoAUtilizarExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
