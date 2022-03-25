package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SaldoInicial.SaldoInicialFiltroAvanPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFFiltrosAvanPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class TabelaComplementarParaDIRFFiltrosAvan extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaComplementarParaDIRFFiltrosAvanPO tabelaComplementarParaDIRFFiltrosAvanPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationKen();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaComplementarParaDIRFFiltrosAvanPO = new TabelaComplementarParaDIRFFiltrosAvanPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtrosAvanTabelaComplementarParaDIRF() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		ArrayList<Boolean> empresa = tabelaComplementarParaDIRFFiltrosAvanPO.filtroEmpresa();
		for (int i = 0; i < empresa.size(); i++) {
			assertTrue(empresa.get(i), Filtros);
		}

		ArrayList<Boolean> uf = tabelaComplementarParaDIRFFiltrosAvanPO.filtroUF();
		for (int i = 0; i < uf.size(); i++) {
			assertTrue(uf.get(i), Filtros);
		}

		ArrayList<Boolean> filial = tabelaComplementarParaDIRFFiltrosAvanPO.filtroFilial();
		for (int i = 0; i < filial.size(); i++) {
			assertTrue(filial.get(i), Filtros);
		}

		ArrayList<Boolean> usuarioCriacao = tabelaComplementarParaDIRFFiltrosAvanPO.filtroUsuarioCriacao();
		for (int i = 0; i < usuarioCriacao.size(); i++) {
			assertTrue(usuarioCriacao.get(i), Filtros);
		}

		ArrayList<Boolean> dataCriacao = tabelaComplementarParaDIRFFiltrosAvanPO.filtroDataCriacao();
		for (int i = 0; i < dataCriacao.size(); i++) {
			assertTrue(dataCriacao.get(i), Filtros);
		}

		ArrayList<Boolean> usuarioModificao = tabelaComplementarParaDIRFFiltrosAvanPO.filtroUsuarioModificao();
		for (int i = 0; i < usuarioModificao.size(); i++) {
			assertTrue(usuarioModificao.get(i), Filtros);
		}
		ArrayList<Boolean> dataModificaco = tabelaComplementarParaDIRFFiltrosAvanPO.filtroDataModificao();
		for (int i = 0; i < dataModificaco.size(); i++) {
			assertTrue(dataModificaco.get(i), Filtros);
		}
	}

}
