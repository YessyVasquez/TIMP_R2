package com.timp.test.CALENDAR.Tarefas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.Calendar.AcessarCalendarPO;
import com.sap.timp.pageObjectModel.Calendar.Tarefas.TarefasNAMúltiplosUsuáriosPO;
import com.sap.timp.pageObjectModel.Calendar.Tarefas.TarefasNASolicitarEsclarecimentoPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class TarefasNASolicitarEsclarecimento extends TestBaseSteven {
	LoginTC loginTC;
	AcessarCalendarPO acessarCalendarPO;
	TarefasNASolicitarEsclarecimentoPO tarefasNASolicitarEsclarecimentoPO;
 
  @BeforeClass
  public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarCalendarPO = new AcessarCalendarPO();
		tarefasNASolicitarEsclarecimentoPO = new TarefasNASolicitarEsclarecimentoPO();
		
  }

  @AfterClass
  public void afterClass() {
	 // driver.close();
  }

  @Test(priority = 0)
	public void login() {
		loginTC.login();

	}
	

//	@Test(priority = 1)
//	public void AccesarBPMA() {
//
//		tarefasNASolicitarEsclarecimentoPO.acessarBPMA();
//	}
//	
//	@Test(priority = 2)
//	public void CriarProceso() {
//
//		ArrayList<Boolean> sucesso = tarefasNASolicitarEsclarecimentoPO.criar();
//		
//		for (int i = 0; i < sucesso.size(); i++) {
//			assertTrue(sucesso.get(i), Criar);
//		}
//
//	}
//	
//	@Test(priority = 3)
//	public void ativadorProcesos() {
//
//		tarefasNASolicitarEsclarecimentoPO.ativadorProcesos();
//
//	}
//	
//	@Test(priority = 4)
//	public void TFPEntrar() {
//
//		boolean sucesso = tarefasNASolicitarEsclarecimentoPO.acessarTFP();
//		assertTrue(sucesso, "The element is not present");
//
//	}
//
//	@Test(priority = 5)
//	public void filtroTFP() {
//
//		ArrayList<Boolean> sucesso = tarefasNASolicitarEsclarecimentoPO.filtroTFP();
//		
//		for (int i = 0; i < sucesso.size(); i++) {
//			assertTrue(sucesso.get(i), Criar);
//		}
//
//	}
	
//	@Test(priority = 6)
//	public void CalendarEntrar() {
//
//		boolean sucesso = tarefasNASolicitarEsclarecimentoPO.acessarCalendar();
//		assertTrue(sucesso, "Não se Conseguiu Acessar o Componente");
//
//	}
	
	
//	@Test(priority = 7)
//	public void Calendario() {
//
//		ArrayList<Boolean> sucesso = tarefasNASolicitarEsclarecimentoPO.Calendario();
//		
//		for (int i = 0; i < sucesso.size(); i++) {
//			assertTrue(sucesso.get(i), Criar);
//		}
//
//	}
	
	@Test(priority = 9)
	public void AccesarBPMA2() {

		tarefasNASolicitarEsclarecimentoPO.acessarBPMA();
	}
	
	@Test(priority = 10)
	public void Lexeira1() {

		ArrayList<Boolean> sucesso = tarefasNASolicitarEsclarecimentoPO.lexeiraProcesos();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), eliminar);
		}

	}
	
	@Test(priority = 11)
	public void Lexeira2() {

		ArrayList<Boolean> sucesso = tarefasNASolicitarEsclarecimentoPO.lexeiraAtivador();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), eliminar);
		}

	}
	
}
