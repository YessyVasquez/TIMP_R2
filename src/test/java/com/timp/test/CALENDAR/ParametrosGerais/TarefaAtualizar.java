package com.timp.test.CALENDAR.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BPMA.AcessarBPMAPO;
import com.sap.timp.pageObjectModel.Calendar.AcessarCalendarPO;
import com.sap.timp.pageObjectModel.Calendar.ParametrosGerais.TarefasAtualizarPO;
import com.sap.timp.pageObjectModel.Calendar.ParametrosGerais.CalendarioDeUsuariosPO;
import com.sap.timp.pageObjectModel.Calendar.ParametrosGerais.NovaTarefaPO;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;

public class TarefaAtualizar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarCalendarPO acessarCalendarPO;
	AcessarBPMAPO acessarBPMAPO;
	TarefasAtualizarPO atualizarPO;

	public TarefaAtualizar() {
		super();
	}

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarCalendarPO = new AcessarCalendarPO();
		atualizarPO = new TarefasAtualizarPO();
		acessarBPMAPO = new AcessarBPMAPO();
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
		acessarBPMAPO.acessarBPMA();

	}

	@Test(priority = 3)
	public void bpma() {

		boolean sucesso = atualizarPO.BPMA();

		assertTrue(sucesso, Atualizar);

	}
	
	@Test(priority = 4)
	public void tfp() {

		boolean sucesso = atualizarPO.TFP();

		assertTrue(sucesso, Atualizar);

	}
	
	@Test(priority = 5)
	public void calendar() {

		atualizarPO.Calendar();

		

	}

}
