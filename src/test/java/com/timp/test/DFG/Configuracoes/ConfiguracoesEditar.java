package com.timp.test.DFG.Configuracoes;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Configuracoes.ConfiguracoesCriarPO;
import com.sap.timp.pageObjectModel.DFG.Configuracoes.ConfiguracoesEditarPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.ParametrosGeraisCriarRaizIDPúblicoPrivadoCriarPO;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoCriarPO;
import com.timp.test.DFG.AcessarDFG;


public class ConfiguracoesEditar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	ConfiguracoesEditarPO configuracoesEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		configuracoesEditarPO = new ConfiguracoesEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void criar() {
		
		loginTC.login();
		acessarDFGPO.acessarDFG();
		boolean sucesso = configuracoesEditarPO.editar();
		
		assertTrue(sucesso, Editar);
	}
}
