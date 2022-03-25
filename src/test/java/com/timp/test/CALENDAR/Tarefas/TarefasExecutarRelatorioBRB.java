package com.timp.test.CALENDAR.Tarefas;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.Calendar.AcessarCalendarPO;
import com.sap.timp.pageObjectModel.Calendar.Tarefas.TarefasExecutarRelatorioBRBPO;

public class TarefasExecutarRelatorioBRB extends TestBaseSteven {

	LoginTC loginTC;
	AcessarCalendarPO acessarCalendarPO;
	TarefasExecutarRelatorioBRBPO tarefasExecutarRelatorioBRBPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarCalendarPO = new AcessarCalendarPO();
		tarefasExecutarRelatorioBRBPO = new TarefasExecutarRelatorioBRBPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 2)
	public void acessarCalendar() {
		acessarCalendarPO.acessarCalendar();

	}

	@Test(priority = 3)
	public void CalendarEntrar() {

		boolean sucesso = tarefasExecutarRelatorioBRBPO.abrirCalendario();

		assertTrue(sucesso, "Não foi executado");

	}

}
