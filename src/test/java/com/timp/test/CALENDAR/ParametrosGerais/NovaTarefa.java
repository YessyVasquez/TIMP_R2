package com.timp.test.CALENDAR.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.Calendar.AcessarCalendarPO;
import com.sap.timp.pageObjectModel.Calendar.ParametrosGerais.CalendarioDeUsuariosPO;
import com.sap.timp.pageObjectModel.Calendar.ParametrosGerais.NovaTarefaPO;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;

public class NovaTarefa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarCalendarPO acessarCalendarPO;
	NovaTarefaPO novaTarefaPO;
	
	public NovaTarefa() {
		super();
	}

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarCalendarPO = new AcessarCalendarPO();
		novaTarefaPO = new NovaTarefaPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
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
	public void novaTarefa() {

		ArrayList<Boolean> sucesso = novaTarefaPO.criar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}

	}
	

	@Test(priority = 4)
	public void excluir() {

		boolean sucesso = novaTarefaPO.excluir();

		assertTrue(sucesso, Eliminado);


	}


}
