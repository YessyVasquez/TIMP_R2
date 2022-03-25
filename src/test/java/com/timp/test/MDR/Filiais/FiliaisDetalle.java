package com.timp.test.MDR.Filiais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Filiais.FiliaisDetallesPo;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.openqa.selenium.remote.NewSessionPayload;
import org.testng.annotations.AfterClass;

public class FiliaisDetalle extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	FiliaisDetallesPo filiaisDetallePO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		acessarMDRPO = new AcessarMDRPO();
		loginTC = new LoginTC();
		
		filiaisDetallePO = new FiliaisDetallesPo();

	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}

	@Test()
	public void detalle() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = filiaisDetallePO.Detalle();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}

}
