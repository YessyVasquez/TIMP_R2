package com.timp.test.CALENDAR.Tarefas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BPMA.AcessarBPMAPO;
import com.sap.timp.pageObjectModel.BPMA.ProcessodeNegócio.CriarProcessocomTarefaAutomatizadaPO;
import com.sap.timp.pageObjectModel.Calendar.AcessarCalendarPO;
import com.sap.timp.pageObjectModel.Calendar.Tarefas.TarefasMultiplasEstagiosPO;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;


import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class TarefasMultiplasEstagios extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarBPMAPO acessarBPMA;
	TarefasMultiplasEstagiosPO  tarefasMultiplasEstagiosPO;

	AcessarTFPPO acessarTFPPO;
	AcessarCalendarPO acessarCalendarPO;

	
  @BeforeClass
  public void beforeClass() {
	  
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  acessarBPMA = new AcessarBPMAPO();
	  tarefasMultiplasEstagiosPO = new  TarefasMultiplasEstagiosPO();
	  
	  acessarTFPPO = new AcessarTFPPO();
	  acessarCalendarPO = new AcessarCalendarPO();
  }

  @AfterClass
  public void afterClass() {
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
	public void criar() {
 		//tarefasMultiplasEstagiosPO.criarProceso();
		ArrayList<Boolean> sucesso = tarefasMultiplasEstagiosPO.criarProceso();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
 	
 	@Test(priority = 3)
	public void TFPEntrar() {
		 acessarTFPPO .acessarTFP();
	}
 	

 	@Test(priority = 4)
 	public void irTFP() {
 		//tarefasMultiplasEstagiosPO.irTFP();
 		ArrayList<Boolean> sucesso = tarefasMultiplasEstagiosPO.irTFP();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}
	}
 	
 	@Test(priority = 5)
	public void CalendarioEntrar() {
		acessarCalendarPO.acessarCalendar();
	}
 	
 	@Test(priority = 6)
 	public void irCalendario() {
 		tarefasMultiplasEstagiosPO.irCalendario();
	}
 	
 	@Test(priority = 7)
 	public void BPMAEntrarDeNuevo() {
 		 acessarBPMA.acessarBPMA();
 	}
 	
 	@Test(priority = 8)
 	public void lixeiraProcesoNegocio() {
 		tarefasMultiplasEstagiosPO.lixeiraProcesoNegocio();
 	}
 	
 	
 	
 	
}
