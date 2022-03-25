package com.timp.test.MDR.AtividadesFiscais.GrupoAtividadeFiscal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeFiltrosAvancadosPO;
import com.sap.timp.pageObjectModel.MDR.CodigoReceita.CodigoReceitaFiltrosAvanPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class GrupoAtividadeFiltrosAvancados extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	GrupoAtividadeFiltrosAvancadosPO grupoAtividadeFiltrosAvancadosPO;
	

	@BeforeClass
	public void beforeClass() {

		driver = initializationKen();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		grupoAtividadeFiltrosAvancadosPO = new GrupoAtividadeFiltrosAvancadosPO();
		
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	  public void filtrosAvanzados() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		
		ArrayList<Boolean> grupo = grupoAtividadeFiltrosAvancadosPO.filtroGrupo();
		for (int i = 0; i < grupo.size(); i++) {
			assertTrue(grupo.get(i), Filtros);
		}
		
		ArrayList<Boolean> descricao = grupoAtividadeFiltrosAvancadosPO.filtroDescricao();
		for (int i = 0; i < descricao.size(); i++) {
			assertTrue(descricao.get(i), Filtros);
		}
		sleep(2000);
	  }
}
