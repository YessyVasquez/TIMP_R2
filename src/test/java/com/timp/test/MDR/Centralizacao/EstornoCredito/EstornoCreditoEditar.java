package com.timp.test.MDR.Centralizacao.EstornoCredito;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.EstornoCredito.*;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class EstornoCreditoEditar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;

	EstornoCreditoEditarPO estornoCreditoEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		estornoCreditoEditarPO = new EstornoCreditoEditarPO();

	}

	@AfterClass
	public void afterClass() {
		
		driver.close();
	}

	@Test()
	public void editar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

	
		boolean sucesso = estornoCreditoEditarPO.Editar();
		 assertTrue(sucesso, Editar);
		 sleep(2000);
	}

}
