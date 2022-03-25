package com.timp.test.TFP.Configurações.Status.SubPeriodo;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configurações.Status.SubPeriodo.ConfiguracoesStatusSubPeriodoVerPO;

public class ConfiguracoesStatusSubPeriodoVer extends TestBaseSteven{
 
	
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	ConfiguracoesStatusSubPeriodoVerPO configuracoesStatusSubPeriodoVerPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		configuracoesStatusSubPeriodoVerPO = new ConfiguracoesStatusSubPeriodoVerPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void ver() {
		
		loginTC.login();
		acessarTFPPO.acessarTFP();
		
		ArrayList<Boolean> sucesso = configuracoesStatusSubPeriodoVerPO.ver();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
}
