package com.timp.test.ATR.Estruturas.MapeamentoDeParametrosDeEntrada;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeParametrosDeEntrada.MapeamentodeParâmetrosdeEntradaFiltroporIDLimparPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class MapeamentodeParâmetrosdeEntradaFiltroporIDLimpar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	MapeamentodeParâmetrosdeEntradaFiltroporIDLimparPO mapeamentodeParâmetrosdeEntradaFiltroporIDLimparPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarATRPO = new AcessarATRPO();
		mapeamentodeParâmetrosdeEntradaFiltroporIDLimparPO = new MapeamentodeParâmetrosdeEntradaFiltroporIDLimparPO();

	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}



	@Test()
	public void filtro() {
		
		loginTC.login();
		 acessarATRPO.acessarATR();

		boolean sucesso = mapeamentodeParâmetrosdeEntradaFiltroporIDLimparPO.filtro();
		assertTrue(sucesso, Filtros);
		sleep(2000);
	}

}
