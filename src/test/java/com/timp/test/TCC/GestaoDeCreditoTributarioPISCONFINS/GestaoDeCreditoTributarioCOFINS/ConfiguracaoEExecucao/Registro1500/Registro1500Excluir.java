package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.Registro1500;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.Registro1500.Registro1500ExcluirPO;

public class Registro1500Excluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Registro1500ExcluirPO registro1500ExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		registro1500ExcluirPO = new Registro1500ExcluirPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}


	@Test()
	public void excluir() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = registro1500ExcluirPO.excluir();

		assertTrue(sucesso, Eliminado);
	}

}
