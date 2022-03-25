package com.timp.test.TBD.Configuração.TipoDeDocumento;

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
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;
import com.sap.timp.pageObjectModel.TBD.Configuracao.TipoDeDocumento.FiltroPorIdPO;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.ConfiguracaoEExecucao.CampoPesquisaPO;

public class FiltroPorID extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTBDPO acessarTBDPO;
	FiltroPorIdPO filtroPorIdPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTBDPO = new AcessarTBDPO();
		filtroPorIdPO = new FiltroPorIdPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void filtro() {
		loginTC.login();
		acessarTBDPO.acessarTBD();

		boolean sucesso = filtroPorIdPO.filtro();

		assertTrue(sucesso, Filtros);
		sleep(3000);
	}

}
