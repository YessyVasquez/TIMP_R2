package com.timp.test.MDR.CenariosCorrecao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CenariosCorrecao.CenariosCorrecaoFiltrosAvanzadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CenariosCorrecaoFiltrosAvanzados extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CenariosCorrecaoFiltrosAvanzadosPO cenariosCorrecaoFiltrosAvanzadosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		cenariosCorrecaoFiltrosAvanzadosPO = new CenariosCorrecaoFiltrosAvanzadosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtros() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();
		
		ArrayList<Boolean> sucesso = cenariosCorrecaoFiltrosAvanzadosPO.tributo();
		sleep(2000);
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "The results in the filter attribute aren't equal");
		}
		sleep(2000);

		ArrayList<Boolean> sucesso2 = cenariosCorrecaoFiltrosAvanzadosPO.usuario();
		sleep(2000);
		for (int i = 0; i < sucesso2.size(); i++) {
			assertTrue(sucesso2.get(i), "The results in the filter user aren't equal");
		}
		sleep(2000);

		ArrayList<Boolean> sucesso4 = cenariosCorrecaoFiltrosAvanzadosPO.usuarioModificado();
		sleep(2000);
		for (int i = 0; i < sucesso4.size(); i++) {
			assertTrue(sucesso4.get(i), "The results in the filter user modified aren't equal");
		}
		sleep(2000);

	}
}
