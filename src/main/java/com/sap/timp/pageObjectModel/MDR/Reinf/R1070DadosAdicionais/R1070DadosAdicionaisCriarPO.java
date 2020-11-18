package com.sap.timp.pageObjectModel.MDR.Reinf.R1070DadosAdicionais;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class R1070DadosAdicionaisCriarPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Reinf\"]")
	public WebElement Reinf;
	
	@FindBy(xpath = "//span[text()=\"R1070 - Dados Adicionais\"]")
	public WebElement R1070DadosAdicionais;

	@FindBy(xpath = "/span[text()=\"New Reinf Dados Adicionais\"]")
	public WebElement Novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Empresa\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div")
	public WebElement opcEmpresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Filial\"]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div")
	public WebElement opcFilial;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Data\"]")
	public WebElement Data;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Tipo do Processo\"]")
	public WebElement tipoProcesso;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div")
	public WebElement opcTipoProcesso;
	
public R1070DadosAdicionaisCriarPO() {
	PageFactory.initElements(driver, this);
}

public void Criar() {

}
}
