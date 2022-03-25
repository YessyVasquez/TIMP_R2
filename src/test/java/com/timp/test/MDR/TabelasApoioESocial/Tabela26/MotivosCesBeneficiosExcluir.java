package com.timp.test.MDR.TabelasApoioESocial.Tabela26;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosEliminarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela26.MotivosCesBeneficiosExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class MotivosCesBeneficiosExcluir extends TestBaseFernando {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MotivosCesBeneficiosEliminarPO motivosCesBeneficiosEliminarPO;
	MotivosCesBeneficiosExcluirPO motivosCesBeneficiosExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		// motivosCesBeneficiosEliminarPO = new MotivosCesBeneficiosEliminarPO();
		motivosCesBeneficiosExcluirPO = new MotivosCesBeneficiosExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		// boolean sucesso = motivosCesBeneficiosEliminarPO.eliminar();
		boolean sucesso = motivosCesBeneficiosExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
