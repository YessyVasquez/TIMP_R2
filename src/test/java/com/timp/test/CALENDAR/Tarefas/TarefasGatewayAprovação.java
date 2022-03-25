package com.timp.test.CALENDAR.Tarefas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.Calendar.AcessarCalendarPO;
import com.sap.timp.pageObjectModel.Calendar.Tarefas.TarefasGatewayAprovaçãoPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class TarefasGatewayAprovação extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarCalendarPO acessarCalendarPO;
	TarefasGatewayAprovaçãoPO multiplosUsuariosCalendarPO;
 
  @BeforeClass
  public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarCalendarPO = new AcessarCalendarPO();
		multiplosUsuariosCalendarPO = new TarefasGatewayAprovaçãoPO();
		
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

  @Test(priority = 0)
	public void login() {
		loginTC.login();

	}
	
	@Test(priority = 1)
	public void acessarCalendar() {
		acessarCalendarPO.acessarCalendar();

	}

	@Test(priority = 2)
	public void Calendar() {

		
		ArrayList<Boolean> sucesso = multiplosUsuariosCalendarPO.Calendario();

		  for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		  }

	}
}
