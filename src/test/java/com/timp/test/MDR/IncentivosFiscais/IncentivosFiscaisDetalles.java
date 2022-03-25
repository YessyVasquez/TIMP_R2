package com.timp.test.MDR.IncentivosFiscais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.IncentivosFiscais.IncentivosFiscaisDetallesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class IncentivosFiscaisDetalles extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	IncentivosFiscaisDetallesPO incentivosFiscaisDetallesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		accesarMDRPO = new AcessarMDRPO();
		loginTC = new LoginTC();
		incentivosFiscaisDetallesPO = new IncentivosFiscaisDetallesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void detalhes() {

		loginTC.login();

		accesarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = incentivosFiscaisDetallesPO.Detalle();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
}
