package com.timp.test.DFG.Configuracoes;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Configuracoes.ConfiguracoesCriarPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.ParametrosGeraisCriarRaizIDPúblicoPrivadoCriarPO;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoCriarPO;
import com.timp.test.DFG.AcessarDFG;


public class ConfiguracoesCriar extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	ConfiguracoesCriarPO configuracoesCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		configuracoesCriarPO = new ConfiguracoesCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//Sdriver.close();
	}



	@Test()
	public void criar() {
		loginTC.login();
		acessarDFGPO.acessarDFG();
		ArrayList<Boolean> sucesso =configuracoesCriarPO.criar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
}
