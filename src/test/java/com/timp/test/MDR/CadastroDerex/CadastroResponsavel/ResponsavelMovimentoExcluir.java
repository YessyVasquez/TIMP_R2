package com.timp.test.MDR.CadastroDerex.CadastroResponsavel;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroDerex.CadastroResponsavel.ResponsavelMovimentoExcluirPO;
import com.sap.timp.pageObjectModel.MDR.CadastroDerex.InstituicaoFinanceira.*;

public class ResponsavelMovimentoExcluir extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ResponsavelMovimentoExcluirPO responsavelMovimentoExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		responsavelMovimentoExcluirPO = new ResponsavelMovimentoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void excluir() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = responsavelMovimentoExcluirPO.eliminar();

		assertTrue(sucesso, Eliminado);
		sleep(2000);
	}
}
