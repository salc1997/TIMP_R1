package com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class ConfgEditarBCBPO extends TestBase{

	
	@FindBy(xpath = "//div[@class=\"left-toolbar-items\"]//li[9]")
	public WebElement btnAjuste;
	
	
	
	public ConfgEditarBCBPO() {

		PageFactory.initElements(driver, this);
	}
	
	public void clickbtnAjuste() {
		click(btnAjuste);		
	}
	
	
	
}
