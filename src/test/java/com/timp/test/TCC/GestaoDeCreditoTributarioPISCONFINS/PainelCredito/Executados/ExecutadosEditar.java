package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.PainelCredito.Executados;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;

import com.sap.timp.pageObjectModel.TCC.BancoDeOcorrencias.Executados.BancodeOcorrênciasExecutadosEditarPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.PainelCredito.Executados.ExecutadosEditarPO;

public class ExecutadosEditar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ExecutadosEditarPO executadosEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		executadosEditarPO = new ExecutadosEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void executarEditar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		//executadosEditarPO.editarExe();
	
		 boolean sucesso =executadosEditarPO.editarExe();
		 assertTrue(sucesso, Criar);
		
	}
}
