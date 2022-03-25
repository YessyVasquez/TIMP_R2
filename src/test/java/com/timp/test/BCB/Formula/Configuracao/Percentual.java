package com.timp.test.BCB.Formula.Configuracao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ExecucoesSalvas.HierarquiaConfiguracoesExecucoesSalvas.ExecucoesSalvasHierarquiaConfiguracaoTodasAsFuncionalidadesPO;
import com.sap.timp.pageObjectModel.BCB.Formula.Configuracao.PercentualPO;
import com.sap.timp.pageObjectModel.BCB.OrigemBCB.HierarquiaConfiguracao.OrigenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Percentual extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	PercentualPO percentualPO;


	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		percentualPO = new PercentualPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}
	
	@Test(priority = 0)
	public void login() {

		loginTC.login();

	}

	@Test(priority = 1)
	public void brbEntrar() {
		boolean sucesso = acessarBCBPO.acessar();
		System.out.println(sucesso);
		assertTrue(sucesso,Acessar);
	}


	
	@Test(priority = 2)
	public void criarConfiguracionConfiguracao() {
		sleep(2000);
		ArrayList<Boolean>  sucesso = 	percentualPO.ingresarDeUnSolo();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}

}
