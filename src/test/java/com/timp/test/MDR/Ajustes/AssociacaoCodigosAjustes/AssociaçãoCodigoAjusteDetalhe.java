package com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Ajustes.AssociacaoCodigosAjustes.AssociaçãoCodigoAjusteDetalhePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class AssociaçãoCodigoAjusteDetalhe extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	AssociaçãoCodigoAjusteDetalhePO associaçãoCodigoAjusteDetalhePO;
	 
	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		associaçãoCodigoAjusteDetalhePO = new AssociaçãoCodigoAjusteDetalhePO();
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
	  
	@Test()
	public void detalhe() {
		
		loginTC.login();
		
		accesarMDRPO.acessarMDR();
		
		ArrayList<Boolean> sucesso = associaçãoCodigoAjusteDetalhePO.detalheAssociaçãoCodigoAjusteDetalhe();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
		sleep(2000);
	}
}
