package com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250Aquisição;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250Aquisição.S1250AquisiçãoExcluirPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DadosdeEvento.S1250DadosdeEventoExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class S1250AquisiçãoExcluir extends TestBaseSteven{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S1250AquisiçãoExcluirPO s1250AquisiçãoExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s1250AquisiçãoExcluirPO = new S1250AquisiçãoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void excluir() {
		
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = s1250AquisiçãoExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
