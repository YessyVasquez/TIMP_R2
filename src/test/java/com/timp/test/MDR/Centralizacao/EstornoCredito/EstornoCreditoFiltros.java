package com.timp.test.MDR.Centralizacao.EstornoCredito;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.EstornoCredito.*;

public class EstornoCreditoFiltros extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	EstornoCreditoFiltrosPO estornoCreditoFiltrosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		estornoCreditoFiltrosPO = new EstornoCreditoFiltrosPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void filtro() {

		loginTC.login();

		acessarMDRPO.acessarMDR();
		
		boolean text = estornoCreditoFiltrosPO.filtroEstornoCredito();
		assertTrue(text, "Resultado diferente");
		sleep(2000);

	}

}
