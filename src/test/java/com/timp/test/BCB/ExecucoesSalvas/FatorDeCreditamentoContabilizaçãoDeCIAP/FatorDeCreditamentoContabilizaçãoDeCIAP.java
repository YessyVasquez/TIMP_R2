package com.timp.test.BCB.ExecucoesSalvas.FatorDeCreditamentoContabilizaçãoDeCIAP;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ExecucoesSalvas.FatorDeCreditamentoContabilizaçãoDeCIAP.FatorDeCreditamentoContabilizaçãoDeCIAPPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class FatorDeCreditamentoContabilizaçãoDeCIAP extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	FatorDeCreditamentoContabilizaçãoDeCIAPPO fatorDeCreditamentoContabilizaçãoDeCIAPPO;

  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		fatorDeCreditamentoContabilizaçãoDeCIAPPO = new FatorDeCreditamentoContabilizaçãoDeCIAPPO();
		
  }

  @AfterClass
  public void afterClass() {
	//  driver.close();
  }
  
  @Test(priority = 0)
	public void login() {

		loginTC.login();

	}

	@Test(priority = 1)
	public void brbEntrar() {
		 acessarBCBPO.acessar();
		
	}

	@Test(priority = 2)
	public void criarConfiguracaoExecucoes() {
		
		
		ArrayList<Boolean> sucesso = fatorDeCreditamentoContabilizaçãoDeCIAPPO.criarConfiguracaoExecucoes();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 3)
	public void CriarConfiguracao() {

		sleep(2000);
		boolean sucesso = fatorDeCreditamentoContabilizaçãoDeCIAPPO.criarConfiguracao();
		assertTrue(sucesso, Criar);
		
	}
	
	@Test(priority = 4)
	public void configurarConfiguracao() {
		
		ArrayList<Boolean> sucesso = fatorDeCreditamentoContabilizaçãoDeCIAPPO.configurarConfiguracao();	
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 5)
	public void executar() {
		
		sleep(2000);
		boolean sucesso = fatorDeCreditamentoContabilizaçãoDeCIAPPO.executar();
		assertTrue(sucesso, Criar);
	}	
	
	@Test(priority = 6)
	public void EnviarLixeria() {
		
		
		ArrayList<Boolean> sucesso = fatorDeCreditamentoContabilizaçãoDeCIAPPO.lixeira();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	

}
