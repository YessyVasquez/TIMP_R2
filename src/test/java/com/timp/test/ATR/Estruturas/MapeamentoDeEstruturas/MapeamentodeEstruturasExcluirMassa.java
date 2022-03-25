package com.timp.test.ATR.Estruturas.MapeamentoDeEstruturas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeEstruturas.MapeamentodeEstruturasExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class MapeamentodeEstruturasExcluirMassa extends TestBaseSteven {
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	MapeamentodeEstruturasExcluirMassaPO mapeamentodeEstruturasExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarATRPO = new AcessarATRPO();
		mapeamentodeEstruturasExcluirMassaPO = new MapeamentodeEstruturasExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {

	// driver.close();

	}

	
	@Test()
	public void Criar() {
		
		loginTC.login();
		 acessarATRPO.acessarATR();

		ArrayList<Boolean> sucesso = mapeamentodeEstruturasExcluirMassaPO.criar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
		sleep(2000);

	}
	
	@Test(dependsOnMethods = "Criar")
	public void excluirMasa() {
		
		boolean sucesso2 = mapeamentodeEstruturasExcluirMassaPO.excluirMasaMotivosDesligamento();
		assertTrue(sucesso2, Eliminado);
		sleep(2000);
	}

}
