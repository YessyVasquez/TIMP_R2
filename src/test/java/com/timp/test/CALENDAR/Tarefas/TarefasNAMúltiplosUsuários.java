package com.timp.test.CALENDAR.Tarefas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.Calendar.AcessarCalendarPO;
import com.sap.timp.pageObjectModel.Calendar.Tarefas.TarefasNAMúltiplosUsuáriosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class TarefasNAMúltiplosUsuários extends TestBaseSteven {
	LoginTC loginTC;
	AcessarCalendarPO acessarCalendarPO;
	TarefasNAMúltiplosUsuáriosPO tarefasNAMúltiplosUsuáriosPO;
 
  @BeforeClass
  public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarCalendarPO = new AcessarCalendarPO();
		tarefasNAMúltiplosUsuáriosPO = new TarefasNAMúltiplosUsuáriosPO();
		
  }

  @AfterClass
  public void afterClass() {
	 // driver.close();
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

		
		ArrayList<Boolean> sucesso = tarefasNAMúltiplosUsuáriosPO.Calendario();

		  for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		  }

	}

}
