package com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPIC;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPIC.ValoresParaMetodoPICExcluirPO;

public class ValoresParaMetodoPICExcluir extends TestBaseSteven{
 
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ValoresParaMetodoPICExcluirPO valoresParaMetodoPICExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		valoresParaMetodoPICExcluirPO = new ValoresParaMetodoPICExcluirPO();
	}
	
	  @AfterClass public void afterClass(){ driver.close(); }
	 

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = valoresParaMetodoPICExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
		
	}			
	
	
}
