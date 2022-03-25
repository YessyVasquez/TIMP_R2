package com.timp.test.SCANC.OficiosExtemporaneos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.SCANC.AcessarSCANCPO;
import com.sap.timp.pageObjectModel.SCANC.OficiosExtemporaneos.OficiosExtemporaneosCriarPO;
import com.sap.timp.pageObjectModel.SCANC.OficiosExtemporaneos.OficiosExtemporaneosExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class OficiosExtemporaneosExcluir extends TestBaseSteven{
	
	LoginTC loginTC;
	AcessarSCANCPO acessarSCANCPO;
	OficiosExtemporaneosExcluirPO oficiosExtemporaneosExcluirPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarSCANCPO = new AcessarSCANCPO();
		oficiosExtemporaneosExcluirPO = new OficiosExtemporaneosExcluirPO();
	}
	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void scancEntrar() {
		acessarSCANCPO.acessarSCANC();
	}

	@Test(priority = 2)
	public void criar() {

		boolean sucesso = oficiosExtemporaneosExcluirPO.Excluir();
		assertTrue(sucesso, Eliminado);
		sleep(2000);
	}
}


