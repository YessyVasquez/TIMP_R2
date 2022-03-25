package com.timp.test.MDR.CEP.Municipio;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CEP.Municipio.MunicipioCriarPO;
import com.sap.timp.pageObjectModel.MDR.CEP.Municipio.MunicipioEditarPO;
import com.sap.timp.pageObjectModel.MDR.CEP.Municipio.MunicipioEliminarPO;
import com.sap.timp.pageObjectModel.MDR.CEP.Municipio.MunicipioFiltroPO;

public class MunicipioEliminar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MunicipioEliminarPO municipioEliminarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		municipioEliminarPO = new MunicipioEliminarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void excluir() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = municipioEliminarPO.eliminar();
		
		assertTrue(sucesso, Eliminado);
		sleep(2000);
	}
}
