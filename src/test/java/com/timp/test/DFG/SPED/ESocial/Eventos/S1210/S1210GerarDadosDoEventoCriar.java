package com.timp.test.DFG.SPED.ESocial.Eventos.S1210;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.ParametrosGeraisCriarRaizIDPúblicoPrivadoCriarPO;
import com.sap.timp.pageObjectModel.DFG.SPED.EFDICMSIPI.EFDICMSIPICriarPO;
import com.sap.timp.pageObjectModel.DFG.SPED.ESocial.Eventos.S1200.S1200GerarDadosDoEventoPO;
import com.sap.timp.pageObjectModel.DFG.SPED.ESocial.Eventos.S1210.S1210GerarDadosDoEventoPO;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoCriarPO;
import com.timp.test.DFG.AcessarDFG;


public class S1210GerarDadosDoEventoCriar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO; 
	S1210GerarDadosDoEventoPO s1210GerarDadosDoEventoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		s1210GerarDadosDoEventoPO = new S1210GerarDadosDoEventoPO();
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
	public void criarS1200() {
		ArrayList<Boolean> sucesso = s1210GerarDadosDoEventoPO.criar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}

	}
	
	@Test(priority = 3)
	public void editarS1200() {
		boolean sucesso = s1210GerarDadosDoEventoPO.editar();
		assertTrue(sucesso, Editar);

	}

	@Test(priority = 4)
	public void informacaoS1200() {
		ArrayList<Boolean> sucesso = s1210GerarDadosDoEventoPO.informacao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}

	}

	
	@Test(priority = 5)
	public void visualizarS1200() {
		ArrayList<Boolean> sucesso = s1210GerarDadosDoEventoPO.visualizar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}

	}

	
	@Test(priority = 6)
	public void executarS1200() {
		boolean sucesso = s1210GerarDadosDoEventoPO.ExecucaoS1000();
		assertTrue(sucesso, Editar);

	}
	
	@Test(priority = 7)
	public void visualizarAtualizacoesBlocoApuracao() {
		
		ArrayList<Boolean> sucesso = s1210GerarDadosDoEventoPO.visualizarActualizacoes();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}

	}
	
	
	@Test(priority = 8)
	public void arquivosVerificar() {
		
		ArrayList<Boolean> sucesso = s1210GerarDadosDoEventoPO.verificarArquivosRaiz();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}

	}
	
	@Test(priority = 9)
	public void verificarInsert() {
		
		ArrayList<Boolean> sucesso = s1210GerarDadosDoEventoPO.verificacaoInsert();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}

	}
	
	
	@Test(priority = 10)
	public void enviarInsert() {
		
		ArrayList<Boolean> sucesso = s1210GerarDadosDoEventoPO.enviarInsert();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}

	}
	
}
