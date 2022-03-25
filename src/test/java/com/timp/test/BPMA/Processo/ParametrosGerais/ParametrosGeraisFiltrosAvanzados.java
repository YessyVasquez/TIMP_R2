package com.timp.test.BPMA.Processo.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BPMA.AcessarBPMAPO;
import com.sap.timp.pageObjectModel.BPMA.Processo.ParametrosGerais.ParametrosGeraisCriarProcesoRecorrentePO;
import com.sap.timp.pageObjectModel.BPMA.Processo.ParametrosGerais.ParametrosGeraisFiltrosAvanzadosPO;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CodigoReceita.CodigoReceitaFiltrosAvanPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisFiltrosAvanzados extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarBPMAPO acessarBPMA ;
	ParametrosGeraisFiltrosAvanzadosPO  parametrosGeraisFiltrosAvanzadosPO;
	

	 @BeforeClass
	  public void beforeClass() {
		  
		  driver = initializationKen();
		  loginTC = new LoginTC();
		  acessarBPMA = new AcessarBPMAPO();
		  parametrosGeraisFiltrosAvanzadosPO = new  ParametrosGeraisFiltrosAvanzadosPO();
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
	 	public void BPMAEntrar() {
	 		 acessarBPMA.acessarBPMA();
	 		
	 	}

	@Test(priority = 2)
	  public void filtrosAvanzados() {
		
		ArrayList<Boolean> usuarioCriacao = parametrosGeraisFiltrosAvanzadosPO.filtrosUsuarioCriacao();
		for (int i = 0; i < usuarioCriacao.size(); i++) {
			assertTrue(usuarioCriacao.get(i), Filtros);
		}
		

		
		
		ArrayList<Boolean> dataCriacao = parametrosGeraisFiltrosAvanzadosPO.filtroDataCriacao();
		for (int i = 0; i < dataCriacao.size(); i++) {
			assertTrue(dataCriacao.get(i), Filtros);
		}
		
		ArrayList<Boolean> dataModificao = parametrosGeraisFiltrosAvanzadosPO.filtroDataModificao();
		for (int i = 0; i < dataModificao.size(); i++) {
			assertTrue(dataModificao.get(i), Filtros);
		}
		
		ArrayList<Boolean> usuarioModificao = parametrosGeraisFiltrosAvanzadosPO.filtrosUsuarioModificao();
		for (int i = 0; i < usuarioModificao.size(); i++) {
			assertTrue(usuarioModificao.get(i), Filtros);
		}
	}

}
