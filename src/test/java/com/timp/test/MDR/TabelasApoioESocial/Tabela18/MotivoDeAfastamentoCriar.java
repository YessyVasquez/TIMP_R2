package com.timp.test.MDR.TabelasApoioESocial.Tabela18;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela10.TiposDeLotacaoTributariaCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela18.MotivoDeAfastamentoCriarPO;

import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class MotivoDeAfastamentoCriar extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MotivoDeAfastamentoCriarPO motivoDeAfastamentoCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		motivoDeAfastamentoCriarPO = new MotivoDeAfastamentoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = motivoDeAfastamentoCriarPO.criar();

		assertTrue(sucesso, Criar);

	}

}
