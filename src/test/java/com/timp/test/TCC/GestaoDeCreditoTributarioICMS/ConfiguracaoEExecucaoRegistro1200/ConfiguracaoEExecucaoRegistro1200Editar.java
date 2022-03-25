package com.timp.test.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucaoRegistro1200;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoFiltrosPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AtividadeFiscal.*;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.ConfiguracaoEExecucao.CampoPesquisaPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeOcorrencias.ConfiguracaoEExecucao.ConfiguracaoEExecucaoCriarPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeOcorrencias.ConfiguracaoEExecucao.ConfiguracaoEExecucaoEditarPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucaoRegistro1200.ConfiguracaoEExecucaoRegistro1200EditarPO;

public class ConfiguracaoEExecucaoRegistro1200Editar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ConfiguracaoEExecucaoRegistro1200EditarPO configuracaoEExecucaoRegistro1200EditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configuracaoEExecucaoRegistro1200EditarPO = new ConfiguracaoEExecucaoRegistro1200EditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = configuracaoEExecucaoRegistro1200EditarPO.editar();
		assertTrue(sucesso, Editar);
	}

}
