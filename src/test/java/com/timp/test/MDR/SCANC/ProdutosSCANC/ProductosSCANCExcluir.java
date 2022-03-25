package com.timp.test.MDR.SCANC.ProdutosSCANC;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisCriarPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTCriarPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.ProdutosSCANC.ProdutosSCANCCriarPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.ProdutosSCANC.ProdutosSCANCExcluirPO;

public class ProductosSCANCExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ProdutosSCANCExcluirPO produtosSCANCExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		produtosSCANCExcluirPO = new ProdutosSCANCExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = produtosSCANCExcluirPO.excluir();

		assertTrue(sucesso, Eliminado);

	}

}
