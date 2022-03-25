package com.timp.test.DFG.Leiautes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.ParametrosGeraisFiltroAvancadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisFiltroAvancados extends TestBaseMassiel{

	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	ParametrosGeraisFiltroAvancadosPO parametrosGeraisFiltroAvancadosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		parametrosGeraisFiltroAvancadosPO = new ParametrosGeraisFiltroAvancadosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test(priority = 0)
	public void filtroNombre() {
		
		loginTC.login();
		acessarDFGPO.acessarDFG();

		//parametrosGeraisFiltroAvancadosPO.FiltroId();

		ArrayList<Boolean> Nome = parametrosGeraisFiltroAvancadosPO.FiltroNome();
		for (int i = 0; i < Nome.size(); i++) {
			assertTrue(Nome.get(i), Filtros);
		}

		


	}
	
	@Test(priority =1 )
	public void filtrosId() {

		
		ArrayList<Boolean> id = parametrosGeraisFiltroAvancadosPO.FiltroId();
		for (int i = 0; i < id.size(); i++) {
			assertTrue(id.get(i), Filtros);
		}

		


	}
	
	@Test(priority = 2)
	public void filtrosVersao() {


		ArrayList<Boolean> versao = parametrosGeraisFiltroAvancadosPO.FiltroVersao();
		for (int i = 0; i < versao.size(); i++) {
			assertTrue(versao.get(i), Filtros);
		}


	}
	
	@Test(priority = 3)
	public void filtrosFiltroTipo() {

		
		ArrayList<Boolean> tipo = parametrosGeraisFiltroAvancadosPO.FiltroTipo();
		for (int i = 0; i < tipo.size(); i++) {
		assertTrue(tipo.get(i), Filtros);
		}

	}
	
	@Test(priority = 4)
	public void filtrosUsuarioCriado() {

		
		ArrayList<Boolean> UsuarioCriado = parametrosGeraisFiltroAvancadosPO.FiltroUsuarioCriado();
		for (int i = 0; i < UsuarioCriado.size(); i++) {
			assertTrue(UsuarioCriado.get(i), Filtros);
		}
		

	}
	
	@Test(priority =7 )
	public void filtrosUsuarioModificado() {

		
		ArrayList<Boolean> UsuarioModificado = parametrosGeraisFiltroAvancadosPO.FiltroUsuarioModicado();
		for (int i1 = 0; i1 < UsuarioModificado.size(); i1++) {
			assertTrue(UsuarioModificado.get(i1), Filtros);
		}

	}
	
	@Test(priority = 8)
	public void filtrosFechaUsuarioModificado() {


		ArrayList<Boolean> FechaUsuarioModificado = parametrosGeraisFiltroAvancadosPO.FiltroFechaUsuarioModificado();
		for (int i1 = 0; i1 < FechaUsuarioModificado.size(); i1++) {
			assertTrue(FechaUsuarioModificado.get(i1), Filtros);
		}
		
	}
	
	@Test(priority = 9)
	public void filtrosFechaUsuarioCriado() {


		ArrayList<Boolean> FechaUsuarioCriado = parametrosGeraisFiltroAvancadosPO.FiltroFechaUsuarioCriado();
		for (int i = 0; i < FechaUsuarioCriado.size(); i++) {
		assertTrue(FechaUsuarioCriado.get(i), Filtros);
		}


	}
}
