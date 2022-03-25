package com.timp.test.TDK.Kpis.Lixeira;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.Lixeira.KpisLixeiraExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class KpisLixeiraExcluirEmMassa extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisLixeiraExcluirEmMassaPO kpisLixeiraExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisLixeiraExcluirEmMassaPO = new KpisLixeiraExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void comparar() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		boolean sucesso = kpisLixeiraExcluirEmMassaPO.comparar();
		assertTrue(sucesso, Criar);
	}

	@Test(dependsOnMethods = "comparar")

	public void excluir() {
		boolean sucesso2 = kpisLixeiraExcluirEmMassaPO.ExcluirMasas();
		assertTrue(sucesso2, Criar);
	}	
}
