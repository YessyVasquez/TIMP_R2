package com.timp.test.TDK.Kpis.ParâmetrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.KpisExecutarAtualizarJutisficativaGravarPO;

public class KpisExecutarAtualizarJutisficativaGravar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisExecutarAtualizarJutisficativaGravarPO kpisExecutarAtualizarJutisficativaGravarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisExecutarAtualizarJutisficativaGravarPO = new KpisExecutarAtualizarJutisficativaGravarPO();
	}

	@AfterClass
	public void afterClass() {
		//( driver.close();
	}


	@Test()
	public void executar() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		ArrayList<Boolean> sucesso = kpisExecutarAtualizarJutisficativaGravarPO.executar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "Cartão não foi adicionado");
		}
	}
}
