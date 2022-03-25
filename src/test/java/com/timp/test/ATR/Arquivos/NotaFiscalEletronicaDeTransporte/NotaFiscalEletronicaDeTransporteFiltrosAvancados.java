package com.timp.test.ATR.Arquivos.NotaFiscalEletronicaDeTransporte;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Arquivos.NotaFiscalEletronicaDeTransporte.NotaFiscalEletronicaDeTransporteFiltrosAvancadosPO;

public class NotaFiscalEletronicaDeTransporteFiltrosAvancados extends TestBaseSteven {
 
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	NotaFiscalEletronicaDeTransporteFiltrosAvancadosPO notaFiscalEletronicaDeTransporteFiltrosAvancadosPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initialization();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  notaFiscalEletronicaDeTransporteFiltrosAvancadosPO = new  NotaFiscalEletronicaDeTransporteFiltrosAvancadosPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  
	
	 	
	 	@Test()
	 	public void filtro() {
	 		loginTC.login();
	 		 acessarATRPO.acessarATR();
	 		ArrayList<Boolean> sucesso = notaFiscalEletronicaDeTransporteFiltrosAvancadosPO.filtro();
			for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), Filtros);
			}
			sleep(2000);
	 }
	
}
