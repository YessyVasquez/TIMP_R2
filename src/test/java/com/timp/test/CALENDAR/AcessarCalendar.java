package com.timp.test.CALENDAR;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.Calendar.AcessarCalendarPO;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;

public class AcessarCalendar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarCalendarPO acessarCalendarPO;

	public AcessarCalendar() {
		super();
	}

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarCalendarPO = new AcessarCalendarPO();
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
	public void CalendarEntrar() {

		boolean sucesso = acessarCalendarPO.acessarCalendar();
		assertTrue(sucesso, "Não se Conseguiu Acessar o Componente");

	}

}
