package com.timp.test.MDR.AtividadesFiscais.GrupoAtividadeFiscal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeFiscalDetallePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class GrupoAtividadeFiscalDetalle extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	GrupoAtividadeFiscalDetallePO  grupoAtividadeFiscalDetallePO;

  @BeforeClass
  public void beforeClass() {
	  
	  driver = initializationM();
	 loginTC = new LoginTC();
	 acessarMDRPO = new AcessarMDRPO();
	 grupoAtividadeFiscalDetallePO = new GrupoAtividadeFiscalDetallePO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }


	@Test( )
	public void detalle() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();
		
		
		ArrayList<Boolean> sucesso =  grupoAtividadeFiscalDetallePO.Detalle();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
		sleep(2000);
	}
	
}
