package com.timp.test.DFG.SPED.ECF;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.SPED.ECF.ECFFuncionalidadesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ECFFuncionalidades extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	ECFFuncionalidadesPO  eCFFuncionalidadesPO;


  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		eCFFuncionalidadesPO = new ECFFuncionalidadesPO ();
  }

  @AfterClass
  public void afterClass() {
	  //driver.close();
  }

  @Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void mdrEntrar() {
		acessarDFGPO.acessarDFG();

	}
	
	@Test(priority = 2)
	public void ID() {
		eCFFuncionalidadesPO.iD();

	}
	
	@Test(priority = 3)
	public void criar() {
		 boolean sucesso = eCFFuncionalidadesPO.Criar();
		  assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 4)
	public void editar() {
	boolean sucesso = eCFFuncionalidadesPO.Editar();
		  assertTrue(sucesso, Editar);

	}
	
	@Test(priority = 5)
	public void informacao() {
		ArrayList<Boolean> sucesso = eCFFuncionalidadesPO.Informacao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}
	
	@Test(priority = 6)
	public void visualizar() {
		
		ArrayList<Boolean> sucesso = eCFFuncionalidadesPO.Visualizar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
		
	}
	
	@Test(priority = 7 )
	public void criarBlocos() {
		
		
		ArrayList<Boolean> sucesso = eCFFuncionalidadesPO.CriarBlocos();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
		
	}
	
	
	@Test(priority = 8 )
	public void editarBlocos() {
		
		
		ArrayList<Boolean> sucesso = eCFFuncionalidadesPO.EditarBloco();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
		
	}
	
	@Test(priority = 9 )
	public void InformacaoBlocos() {
		
		
		ArrayList<Boolean> sucesso = eCFFuncionalidadesPO.InformacaoBloco();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
		
	}
	
	@Test(priority = 10 )
	public void visualizarBlocos() {
		
		
		ArrayList<Boolean> sucesso = eCFFuncionalidadesPO.VisualizarBloco();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
		
	}
	
	@Test(priority = 11 )
	public void executarBlocos() {
		
		eCFFuncionalidadesPO.ExecutarBloco();
		//ArrayList<Boolean> sucesso = 
		
		//for (int i = 0; i < sucesso.size(); i++) {
		//	assertTrue(sucesso.get(i), Detalhes);
		//}
		
	}
	
	@Test(priority = 11 )
	public void visualizarAN3() {
		
		eCFFuncionalidadesPO.visualizarAN3();
		//ArrayList<Boolean> sucesso = 
		
		//for (int i = 0; i < sucesso.size(); i++) {
		//	assertTrue(sucesso.get(i), Detalhes);
		//}
		
	}
	
	@Test(priority = 12 )
	public void visualizarActualizacao() {
		
	
		ArrayList<Boolean> sucesso = eCFFuncionalidadesPO.VisualizarAtualizações();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
		
	}
	
	
	@Test(priority = 13 )
	public void Gravar() {
		
	
		ArrayList<Boolean> sucesso = eCFFuncionalidadesPO. gravar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
		
	}
}
