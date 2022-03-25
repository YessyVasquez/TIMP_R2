package com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTFiltrosAvanPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosParaLivroICMSSTFiltrosAvan extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ParametrosParaLivroICMSSTFiltrosAvanPO parametrosParaLivroICMSSTFiltrosAvanPO;
	

	@BeforeClass
	public void beforeClass() {

		driver = initializationKen();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		parametrosParaLivroICMSSTFiltrosAvanPO = new ParametrosParaLivroICMSSTFiltrosAvanPO();
		
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	  public void filtrosAvanzados() {
		
		loginTC.login();
		
		acessarMDRPO.acessarMDR();
		
		ArrayList<Boolean> usuarioCriacao = parametrosParaLivroICMSSTFiltrosAvanPO.filtroUsuarioCriacao();
		for (int i = 0; i < usuarioCriacao.size(); i++) {
			assertTrue(usuarioCriacao.get(i), Filtros);
		}
		
		ArrayList<Boolean> dataCriacao = parametrosParaLivroICMSSTFiltrosAvanPO.filtroDataCriacao();
		for (int i = 0; i < dataCriacao.size(); i++) {
			assertTrue(dataCriacao.get(i), Filtros);
		}
		
		ArrayList<Boolean> usuarioModificao = parametrosParaLivroICMSSTFiltrosAvanPO.filtroUsuarioModificao();
		for (int i = 0; i < usuarioModificao.size(); i++) {
			assertTrue(usuarioModificao.get(i), Filtros);
		}
		
		ArrayList<Boolean> dataModificao = parametrosParaLivroICMSSTFiltrosAvanPO.filtroDataModificao();
		for (int i = 0; i < dataModificao.size(); i++) {
			assertTrue(dataModificao.get(i), Filtros);
		}
		
	  }
}
