package com.timp.test.ATR.Estruturas.GrupoDeEstruturas;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.GrupoDeEstruturas.GrupoDeEstruturasFiltroPorIDPO;

public class GrupoDeEstruturasFiltroPorID extends TestBaseSteven {


	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	GrupoDeEstruturasFiltroPorIDPO grupoDeEstruturasFiltroPorIDPO;
	
	@BeforeClass
	public void beforeClass() {


		driver = initialization();
		loginTC = new LoginTC();
		acessarATRPO = new AcessarATRPO();
		grupoDeEstruturasFiltroPorIDPO = new  GrupoDeEstruturasFiltroPorIDPO();
	}


	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void filtro() {

		loginTC.login();

		acessarATRPO.acessarATR();

		ArrayList<Boolean> sucesso = grupoDeEstruturasFiltroPorIDPO.filtro();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}

		sleep(2000);

	}


}
