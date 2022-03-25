package com.timp.test.MDR.EventosESocial.S1210PagamentosDeRendimentosDoTrabalho;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1210PagamentosDeRendimientosDoTrabalho.S1210PagamentosDeRendimientosDoTrabalhoDetalhePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class S1210PagamentosDeRendimientosDoTrabalhoDetalhe extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	S1210PagamentosDeRendimientosDoTrabalhoDetalhePO s1210PagamentosDeRendimientosDoTrabalhoDetalhePO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		s1210PagamentosDeRendimientosDoTrabalhoDetalhePO = new S1210PagamentosDeRendimientosDoTrabalhoDetalhePO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void detalhe() {
		loginTC.login();
		accesarMDRPO.acessarMDR();
		ArrayList<Boolean> sucesso = s1210PagamentosDeRendimientosDoTrabalhoDetalhePO.detalhe();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}
}
