package com.timp.test.MDR.TabelasApoioESocial.Tabela19;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela02.FinanciamentoDeAposEspDetalhePO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoDetalhePO;

public class MotivosdeDesligamentoDetalhe extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	MotivosdeDesligamentoDetalhePO motivosdeDesligamentoDetalhePO;
	 
	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		motivosdeDesligamentoDetalhePO = new MotivosdeDesligamentoDetalhePO();
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
	  
	@Test()
	public void detalhe() {		
		loginTC.login();		
		accesarMDRPO.acessarMDR();
		
		ArrayList<Boolean> sucesso = motivosdeDesligamentoDetalhePO.detalhes();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}
}
