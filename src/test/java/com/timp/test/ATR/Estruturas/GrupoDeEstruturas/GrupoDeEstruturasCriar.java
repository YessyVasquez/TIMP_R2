package com.timp.test.ATR.Estruturas.GrupoDeEstruturas;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.GrupoDeEstruturas.GrupoDeEstruturasCriarPO;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;

public class GrupoDeEstruturasCriar extends TestBaseSteven{
 
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	GrupoDeEstruturasCriarPO grupoDeEstruturasCriarPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarATRPO = new AcessarATRPO();
		grupoDeEstruturasCriarPO = new  GrupoDeEstruturasCriarPO();
	}


	@AfterClass
	public void afterClass() {
	//	driver.close();
	}


	@Test()
	public void criar() {

		loginTC.login();

		acessarATRPO.acessarATR();


		boolean sucesso = grupoDeEstruturasCriarPO.criar();
		assertTrue(sucesso, Criar);
		
		sleep(3000);

	}


}
