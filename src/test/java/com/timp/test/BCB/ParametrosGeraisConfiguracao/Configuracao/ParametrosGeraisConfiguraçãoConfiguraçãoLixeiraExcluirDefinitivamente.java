package com.timp.test.BCB.ParametrosGeraisConfiguracao.Configuracao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfiguraçãoConfiguraçãoLixeiraExcluirDefinitivamentePO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfiguraçãoConfiguraçãoRaizPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisConfiguraçãoConfiguraçãoLixeiraExcluirDefinitivamente extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisConfiguraçãoConfiguraçãoLixeiraExcluirDefinitivamentePO parametrosGeraisConfiguraçãoConfiguraçãoLixeiraExcluirDefinitivamentePO;


	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		parametrosGeraisConfiguraçãoConfiguraçãoLixeiraExcluirDefinitivamentePO = new ParametrosGeraisConfiguraçãoConfiguraçãoLixeiraExcluirDefinitivamentePO();


	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	
	@Test(priority = 2)
	public void criarConfiguracao() {
		loginTC.login();
		acessarBCBPO.acessar();
		
		boolean sucesso = parametrosGeraisConfiguraçãoConfiguraçãoLixeiraExcluirDefinitivamentePO.lixeiraExcluirDefinitivamenteConfiguracao();
		assertTrue(sucesso, Eliminado);
	}

}
