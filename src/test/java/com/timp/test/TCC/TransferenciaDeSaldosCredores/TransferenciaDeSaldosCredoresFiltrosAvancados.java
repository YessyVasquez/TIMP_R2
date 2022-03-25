package com.timp.test.TCC.TransferenciaDeSaldosCredores;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.TransferenciaDeSaldosCredores.TransferenciaDeSaldosCredoresFiltroPorIdPO;
import com.sap.timp.pageObjectModel.TCC.TransferenciaDeSaldosCredores.TransferenciaDeSaldosCredoresFiltrosAvancadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class TransferenciaDeSaldosCredoresFiltrosAvancados extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	TransferenciaDeSaldosCredoresFiltrosAvancadosPO transferenciaDeSaldosCredoresFiltrosAvancadosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationKen();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		transferenciaDeSaldosCredoresFiltrosAvancadosPO = new TransferenciaDeSaldosCredoresFiltrosAvancadosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	
	@Test
	public void filtrarAvanzados() {
		
		loginTC.login();

		acessarTCCPO.acessarTCC();
		ArrayList<Boolean> empresa = transferenciaDeSaldosCredoresFiltrosAvancadosPO.filtroEmpresa();
		for (int i = 0; i < empresa.size(); i++) {
			assertTrue(empresa.get(i), Filtros);
		}
		
		ArrayList<Boolean> estado = transferenciaDeSaldosCredoresFiltrosAvancadosPO.filtroEstado();
		for (int i = 0; i < estado.size(); i++) {
			assertTrue(estado.get(i), Filtros);
		}
		
		ArrayList<Boolean> filialOrigem = transferenciaDeSaldosCredoresFiltrosAvancadosPO.filtroFilialOrigem();
		for (int i = 0; i < filialOrigem.size(); i++) {
			assertTrue(filialOrigem.get(i), Filtros);
		}
		
		
		ArrayList<Boolean> filialDestino = transferenciaDeSaldosCredoresFiltrosAvancadosPO.filtroFilialDestino();
		for (int i = 0; i < filialDestino.size(); i++) {
			assertTrue(filialDestino.get(i), Filtros);
		}
		
		
		ArrayList<Boolean> tributo = transferenciaDeSaldosCredoresFiltrosAvancadosPO.filtroTributo();
		for (int i = 0; i < tributo.size(); i++) {
			assertTrue(tributo.get(i), Filtros);
		}
	 }

}
