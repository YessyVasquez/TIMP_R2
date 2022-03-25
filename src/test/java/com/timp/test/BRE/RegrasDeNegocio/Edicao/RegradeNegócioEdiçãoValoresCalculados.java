package com.timp.test.BRE.RegrasDeNegocio.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.CalculoDeTributos.Edicao.CálculodeTributosValoresCalculadosPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.Edicao.RegradeNegócioEdiçãoValoresCalculadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegradeNegócioEdiçãoValoresCalculados extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegradeNegócioEdiçãoValoresCalculadosPO regradeNegócioEdiçãoValoresCalculadosPO;
	
@BeforeClass
public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regradeNegócioEdiçãoValoresCalculadosPO = new RegradeNegócioEdiçãoValoresCalculadosPO();
}


@AfterClass
public void afterClass() {
	//driver.close();
}

	@Test()
	public void editar() {
		
		loginTC.login();
		acessarBREPO.acessarBRE();

		boolean sucesso = regradeNegócioEdiçãoValoresCalculadosPO.editar();
		assertTrue(sucesso, Editar);


	}


}
