package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeLogradouros;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisCriarPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaLogradouros.TabelaLogradouroDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaOutrosDebitos.TabelaOutrosDebitosDetalhesPO;

public class TabelaLograduroDetalhes extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaLogradouroDetalhesPO tabelaLogradouroDetalhesPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaLogradouroDetalhesPO = new TabelaLogradouroDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void detalhes() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = tabelaLogradouroDetalhesPO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}

}
