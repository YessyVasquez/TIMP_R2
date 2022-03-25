package com.timp.test.BRB.ValidacaoEstruturas;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.ValidacaoEstruturas.ConciliacaoCIAPPO;


public class ConciliacaoCIAP extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	ConciliacaoCIAPPO conciliacaoCIAPPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		conciliacaoCIAPPO = new ConciliacaoCIAPPO();

	}

	/*
	 * @AfterClass public void afterClass(){ driver.close(); }
	 */
	@Test(priority = 0)
	public void login() {

		loginTC.login();

	}

	@Test(priority = 1)
	public void brbEntrar() {
		acessarBrbPO.acessar();

	}

	@Test(priority = 2)
	public void verificar() {

		ArrayList<Boolean> sucesso = conciliacaoCIAPPO.verificar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "Os dados não concordam com os establecidos");
		}

	}

}
