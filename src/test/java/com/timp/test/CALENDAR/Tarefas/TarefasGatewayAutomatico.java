package com.timp.test.CALENDAR.Tarefas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BPMA.AcessarBPMAPO;
import com.sap.timp.pageObjectModel.Calendar.AcessarCalendarPO;
import com.sap.timp.pageObjectModel.Calendar.Tarefas.TarefasGatewayAutomaticoPO;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class TarefasGatewayAutomatico extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarBPMAPO acessarBPMA ;
	TarefasGatewayAutomaticoPO tarefasGatewayAutomaticoPO;
	AcessarCalendarPO acessarCalendarPO;
	AcessarTFPPO acessarTFPPO;

  @BeforeClass
  public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarBPMA = new AcessarBPMAPO();
		tarefasGatewayAutomaticoPO = new TarefasGatewayAutomaticoPO();
		acessarCalendarPO = new AcessarCalendarPO();
		acessarTFPPO = new AcessarTFPPO();
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
		ArrayList<Boolean> sucesso = tarefasGatewayAutomaticoPO.criarProceso();
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
 		
 		ArrayList<Boolean> sucesso = tarefasGatewayAutomaticoPO.irTFP();
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
 		
 		
 		ArrayList<Boolean> sucesso = tarefasGatewayAutomaticoPO.irCalendario();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i),Criar);
		}
	}
 	
 	@Test(priority = 7)
 	public void BPMAEntrarDeNuevo() {
 		 acessarBPMA.acessarBPMA();
 	}
 	
 	@Test(priority = 8)
 	public void lixeiraProcesoNegocio() {
 		tarefasGatewayAutomaticoPO.BPMA();
 	}
 	
 	

}
