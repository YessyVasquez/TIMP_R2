package com.timp.test.TCC.BancoDeCréditoTributário.PainelPerDcomp.ConfiguraçãodeLayoutdePainel;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoTipoCredito.CodigoTipoCreditoFiltrosAvançadosPO;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCréditoTributário.PainelPerDcomp.ConfiguraçãodeLayoutdePainel.ConfiguraçãodeLayoutdePainelFiltrosAvancadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConfiguraçãodeLayoutdePainelFiltrosAvancados extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ConfiguraçãodeLayoutdePainelFiltrosAvancadosPO configuraçãodeLayoutdePainelFiltrosAvancadosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configuraçãodeLayoutdePainelFiltrosAvancadosPO = new ConfiguraçãodeLayoutdePainelFiltrosAvancadosPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}


	@Test()
	public void filtros() {
		loginTC.login();
		acessarTCCPO.acessarTCC();

		ArrayList<Boolean> sucesso = configuraçãodeLayoutdePainelFiltrosAvancadosPO.filtros();
		sleep(2000);
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "The results in the filter aren't equal");
		}

	}
}
