package com.timp.test.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTributo;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTributo.ConfiguracaoDeTributosFiltrosAvançadosPO;

public class ConfiguracaoDeTributoFiltrosAvançados extends TestBaseSteven{
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoDeTributosFiltrosAvançadosPO configuracaoDeTributosFiltrosAvançadosPO;
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarADMPO = new AcessarADMPO();
		configuracaoDeTributosFiltrosAvançadosPO = new ConfiguracaoDeTributosFiltrosAvançadosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	

	@Test()
	public void filtro() {
		loginTC.login();
		acessarADMPO.acessarADM();

		ArrayList<Boolean> sucesso = configuracaoDeTributosFiltrosAvançadosPO.filtro();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}		
		
		sleep(2000);

	}	
}
