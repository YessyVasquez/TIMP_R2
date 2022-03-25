package com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoFiltrosAvancadosPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeFiltrosAvancadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class AssociaçãoFiltrosAvancados extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AssociaçãoFiltrosAvancadosPO associaçãoFiltrosAvancadosPO;
	

	@BeforeClass
	public void beforeClass() {

		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		associaçãoFiltrosAvancadosPO = new AssociaçãoFiltrosAvancadosPO();
		
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	  public void filtrosAvanzados() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		
		ArrayList<Boolean> empresa = associaçãoFiltrosAvancadosPO.filtroEmpresa();
		for (int i = 0; i < empresa.size(); i++) {
			assertTrue(empresa.get(i), Filtros);
		}
		
		ArrayList<Boolean> uf = associaçãoFiltrosAvancadosPO.filtroUF();
		for (int i = 0; i < uf.size(); i++) {
			assertTrue(uf.get(i), Filtros);
		}
		
		ArrayList<Boolean> filial = associaçãoFiltrosAvancadosPO.filtroFilial();
		for (int i = 0; i < filial.size(); i++) {
			assertTrue(filial.get(i), Filtros);
		}
		
		ArrayList<Boolean> tributo = associaçãoFiltrosAvancadosPO.filtroTributo();
		for (int i = 0; i < tributo.size(); i++) {
			assertTrue(tributo.get(i), Filtros);
		}
		sleep(2000);
	  }

}
