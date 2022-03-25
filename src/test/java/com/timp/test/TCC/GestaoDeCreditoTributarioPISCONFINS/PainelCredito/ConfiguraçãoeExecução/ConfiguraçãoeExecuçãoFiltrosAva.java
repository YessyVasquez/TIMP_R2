package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.PainelCredito.ConfiguraçãoeExecução;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.ConfiguracaoEExecucao.ConfiguracaoEExecucaoFiltrosAvançadosPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.PainelCredito.ConfiguraçãoeExecução.ConfiguraçãoeExecuçãoFiltrosAvaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConfiguraçãoeExecuçãoFiltrosAva extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ConfiguraçãoeExecuçãoFiltrosAvaPO configuraçãoeExecuçãoFiltrosAvaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configuraçãoeExecuçãoFiltrosAvaPO = new ConfiguraçãoeExecuçãoFiltrosAvaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void Filtro() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		ArrayList<Boolean> Nome = configuraçãoeExecuçãoFiltrosAvaPO.filtros();
		for (int i = 0; i < Nome.size(); i++) {
			assertTrue(Nome.get(i), Filtros);
		}

	}

}
