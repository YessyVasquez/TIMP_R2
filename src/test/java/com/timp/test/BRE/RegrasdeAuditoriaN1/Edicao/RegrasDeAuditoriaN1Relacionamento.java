
package com.timp.test.BRE.RegrasdeAuditoriaN1.Edicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasAuditoriaN1.Edicao.RegrasDeAuditoriaN1RelacionamentoPO;

public class RegrasDeAuditoriaN1Relacionamento extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeAuditoriaN1RelacionamentoPO regrasDeAuditoriaN1RelacionamentoPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeAuditoriaN1RelacionamentoPO = new RegrasDeAuditoriaN1RelacionamentoPO();
	}


	@AfterClass
	public void afterClass() {
		//driver.close();
	}
	
	@Test()
	public void editar() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		boolean sucesso = regrasDeAuditoriaN1RelacionamentoPO.editar();
		assertTrue(sucesso, "Não foi adicionado o relacionamento");
	}
}
