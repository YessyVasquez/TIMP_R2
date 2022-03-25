package com.timp.test.CALENDAR.Tarefas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BPMA.AcessarBPMAPO;
import com.sap.timp.pageObjectModel.Calendar.AcessarCalendarPO;
import com.sap.timp.pageObjectModel.Calendar.Tarefas.TarefaAutomatizadaPO;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class TarefaAutomatizada extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarBPMAPO acessarBPMA ;
	AcessarCalendarPO acessarCalendarPO;
	AcessarTFPPO acessarTFPPO;
	TarefaAutomatizadaPO tarefaAutomatizadaPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarBPMA = new AcessarBPMAPO();
		acessarCalendarPO = new AcessarCalendarPO();
		acessarTFPPO = new AcessarTFPPO();
		tarefaAutomatizadaPO  = new TarefaAutomatizadaPO();
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
		
		
		ArrayList<Boolean> sucesso = tarefaAutomatizadaPO.criarProceso();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i),Criar);
		}
		
	}
	
	
	@Test(priority = 3)
	public void TFPEntrar() {
		 acessarTFPPO .acessarTFP();
	}
 	

 	@Test(priority = 4)
 	public void irTFP() {
 		

 		
 		ArrayList<Boolean> sucesso =  tarefaAutomatizadaPO.irTFP();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i),Criar);
		}
	}
 	
	
 	 	@Test(priority = 5)
	public void CalendarioEntrar() {
		acessarCalendarPO.acessarCalendar();
	}
 	
	@Test(priority = 6)
 	public void irCalendario() {
 		
 		
 		ArrayList<Boolean> sucesso = tarefaAutomatizadaPO.irCalendario();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i),Criar);
		}
	}
	
	@Test(priority = 7)
	public void TFPEntrar2() {
		 acessarTFPPO .acessarTFP();
	}
 	

 	@Test(priority = 8)
 	public void irTFP2() {
 		

 		
 		ArrayList<Boolean> sucesso =  tarefaAutomatizadaPO.irTFP2();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i),Criar);
		}
	}
 	
 	@Test(priority = 9)
 	public void BPMAEntrar2() {
 		 acessarBPMA.acessarBPMA();
 		
 	}
 	
 	@Test(priority =10 )
 	public void Lixeria() {
 		
 		ArrayList<Boolean> sucesso = tarefaAutomatizadaPO.BPMA();
 		for (int i = 0; i < sucesso.size(); i++) {
 			assertTrue(sucesso.get(i),Criar);
 		}
 		
 	}
}
