package com.timp.test.MDR.Centralizacao.EstornoCredito;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.EstornoCredito.*;

public class EstornoCreditoCriar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;

	EstornoCreditoCriarPO estornoCreditoCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		estornoCreditoCriarPO = new EstornoCreditoCriarPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
		
	}


	@Test()
	public void criar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = estornoCreditoCriarPO.CriarEstornoCredito();

		assertTrue(sucesso, Criar);
		sleep(2000);


	}

}
