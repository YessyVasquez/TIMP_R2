package com.timp.test.MDR.EventosESocial.S2210ComunicaçãoDeAcidenteDeTrabalho;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S2210ComunicaçãoDeAcidenteDeTrabalho.S2210ComunicaçãoDeAcidenteDeTrabalhoExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class S2210ComunicaçãoDeAcidenteDeTrabalhoExcluir extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	S2210ComunicaçãoDeAcidenteDeTrabalhoExcluirPO s2210ComunicaçãoDeAcidenteDeTrabalhoExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		s2210ComunicaçãoDeAcidenteDeTrabalhoExcluirPO = new S2210ComunicaçãoDeAcidenteDeTrabalhoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void excluir() {
		loginTC.login();
		accesarMDRPO.acessarMDR();
		boolean sucesso = s2210ComunicaçãoDeAcidenteDeTrabalhoExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
	}
}
