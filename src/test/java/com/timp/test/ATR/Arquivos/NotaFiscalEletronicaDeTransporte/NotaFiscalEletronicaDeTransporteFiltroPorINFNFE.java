package com.timp.test.ATR.Arquivos.NotaFiscalEletronicaDeTransporte;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Arquivos.NotaFiscalEletronicaDeTransporte.NotaFiscalEletronicaDeTransporteFiltroPorINFNFEPO;

public class NotaFiscalEletronicaDeTransporteFiltroPorINFNFE extends TestBaseSteven {
	
	LoginTC loginTC; 
	AcessarATRPO acessarATRPO;
	NotaFiscalEletronicaDeTransporteFiltroPorINFNFEPO notaFiscalEletronicaDeTransporteFiltroPorINFNFEPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initialization();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  notaFiscalEletronicaDeTransporteFiltroPorINFNFEPO = new  NotaFiscalEletronicaDeTransporteFiltroPorINFNFEPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  
	 	@Test()
	 	public void filtro() {
	 		loginTC.login();
	 		
	 		 acessarATRPO.acessarATR();
	 		 
	 		
	 		ArrayList<Boolean> sucesso = notaFiscalEletronicaDeTransporteFiltroPorINFNFEPO.filtro();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), Filtros);
			}
			
		
	 		sleep(2000);
	 	}
 
}
