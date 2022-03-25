package com.timp.test.ATR.Estruturas.MapeamentoDeParametrosDeEntrada;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeParametrosDeEntrada.MapeamentoDeParametrosDeEntradaExcluirEmMassaPO;

public class MapeamentoDeParametrosDeEntradaExcluirEmMassa extends TestBaseSteven{

	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	MapeamentoDeParametrosDeEntradaExcluirEmMassaPO mapeamentoDeParametrosDeEntradaExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarATRPO = new AcessarATRPO();
		mapeamentoDeParametrosDeEntradaExcluirEmMassaPO = new MapeamentoDeParametrosDeEntradaExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	
	@Test()
	public void criar() {

		loginTC.login();
		 acessarATRPO.acessarATR();
		 
		boolean sucesso = mapeamentoDeParametrosDeEntradaExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
	

	}
	
	@Test(dependsOnMethods = "criar")
	public void excluir() {
		
		boolean sucesso2 = mapeamentoDeParametrosDeEntradaExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);
		sleep(2000);
	}
	
}
