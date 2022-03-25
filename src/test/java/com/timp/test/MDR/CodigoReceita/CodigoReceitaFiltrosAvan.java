package com.timp.test.MDR.CodigoReceita;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CodigoReceita.CodigoReceitaFiltrosAvanPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTFiltrosAvanPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CodigoReceitaFiltrosAvan extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoReceitaFiltrosAvanPO codigoReceitaFiltrosAvanPO;
	

	@BeforeClass
	public void beforeClass() {

		driver = initializationKen();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoReceitaFiltrosAvanPO = new CodigoReceitaFiltrosAvanPO();
		
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	  public void filtrosAvanzados() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		
		ArrayList<Boolean> usuarioCriacao = codigoReceitaFiltrosAvanPO.filtroTributo();
		for (int i = 0; i < usuarioCriacao.size(); i++) {
			assertTrue(usuarioCriacao.get(i), Filtros);
		}
		
		ArrayList<Boolean> dataCriacao = codigoReceitaFiltrosAvanPO.filtroDataInicialVigencia();
		for (int i = 0; i < dataCriacao.size(); i++) {
			assertTrue(dataCriacao.get(i), Filtros);
		}
		
	  }

}
