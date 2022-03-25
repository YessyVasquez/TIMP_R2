package com.timp.test.BRB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.CriarCopiaPO;
import com.sap.timp.pageObjectModel.BRB.ExcluirColunaPO;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Rectangle;

import javax.security.auth.x500.X500Principal;
import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class ExcluirColuna extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	ExcluirColunaPO excluirColunaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		excluirColunaPO = new ExcluirColunaPO();

	}

	@AfterClass
	public void afterClass() {

		driver.close();

	}


	@Test()
	public void excluirColunaDragNDrop() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();
		

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso = excluirColunaPO.DragNDrop();
		System.out.println(sucesso + "Drag N Drop");
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), deletarColuna);
		}

	}
	

//	@Test()
//	public void excluirColunaOpcao() {
//
//		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
//		sucesso = excluirColunaPO.ExcluirColuna();
//		System.out.println(sucesso + "Coluna");
//		for (int i = 0; i < sucesso.size(); i++) {
//			assertTrue(sucesso.get(i), "The element wasn't removed");
//		}
//
//	}

}
