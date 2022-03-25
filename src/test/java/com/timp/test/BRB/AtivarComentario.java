package com.timp.test.BRB;

import static org.testng.Assert.assertTrue;
import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.AtivarComentarioPO;

public class AtivarComentario extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	AtivarComentarioPO ativarComentarioPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		ativarComentarioPO = new AtivarComentarioPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void ativarComentarios() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();
		

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso = ativarComentarioPO.correcaoAtiva();
		System.out.println(sucesso);

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), comentariosInativos);
		}
		sleep(2000);
	}

}
