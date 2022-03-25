package com.timp.test.BPMA.Processo.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BPMA.AcessarBPMAPO;
import com.sap.timp.pageObjectModel.BPMA.Processo.ParametrosGerais.ParametrosGeraisPesquisaPorNomeDeProcessoPO;

public class ParametrosGeraisPesquisaPorNomeDeProcesso extends TestBaseSteven {

	
	LoginTC loginTC;
	AcessarBPMAPO acessarBPMAPO;
	ParametrosGeraisPesquisaPorNomeDeProcessoPO parametrosGeraisPesquisaPorNomeDeProcessoPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBPMAPO = new AcessarBPMAPO();
		parametrosGeraisPesquisaPorNomeDeProcessoPO = new ParametrosGeraisPesquisaPorNomeDeProcessoPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void acessarBPMA() {
		acessarBPMAPO.acessarBPMA();
	}
	
	@Test(priority = 2)
	public void criar() {
		ArrayList<Boolean> sucesso = parametrosGeraisPesquisaPorNomeDeProcessoPO.PesquisaNome();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}
		
	}
}
