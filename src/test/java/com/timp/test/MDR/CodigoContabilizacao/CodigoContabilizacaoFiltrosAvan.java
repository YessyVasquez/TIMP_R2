package com.timp.test.MDR.CodigoContabilizacao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CodigoContabilizacao.CodigoContabilizacaoFiltrosAvanPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CodigoContabilizacaoFiltrosAvan extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
    CodigoContabilizacaoFiltrosAvanPO  codigoContabilizacaoFiltrosAvanPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationKen();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoContabilizacaoFiltrosAvanPO = new CodigoContabilizacaoFiltrosAvanPO();
		
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}



	@Test()
	  public void filtrarAvanCodigoContabilizacao() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();
		
//		ArrayList<Boolean> empresa = codigoContabilizacaoFiltrosAvanPO.filtroEmpresa();
//		for (int i = 0; i < empresa.size(); i++) {
//			assertTrue(empresa.get(i), Filtros);
//		}
		
		
		ArrayList<Boolean> filial = codigoContabilizacaoFiltrosAvanPO.filtroDataIniVigencia();
		for (int i = 0; i < filial.size(); i++) {
			assertTrue(filial.get(i), Filtros);
		}

	  }

}
