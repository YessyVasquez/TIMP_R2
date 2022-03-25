package com.timp.test.MDR.OcorrenciaFiscal.StatusOcorrenciaFiscal;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.OcorrenciaFiscal.StatusOcorrenciaFiscal.StatusOcurrenciaFiscalVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.SubItensValidos.SubItensValidosVisualizarPO;

public class StatusOcurrenciaFiscalVisualizar extends TestBaseFernando {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	StatusOcurrenciaFiscalVisualizarPO statusOcurrenciaFiscalVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		statusOcurrenciaFiscalVisualizarPO = new StatusOcurrenciaFiscalVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void visualizar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = statusOcurrenciaFiscalVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}

}
