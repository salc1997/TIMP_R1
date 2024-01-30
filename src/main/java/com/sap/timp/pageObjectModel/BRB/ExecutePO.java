package com.sap.timp.pageObjectModel.BRB;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class ExecutePO extends TestBase{

	
	@FindBy(xpath = "//ul[@class=\"library-toolbar-items\"]//button/span[contains(text(),\"Exe\")]")
	public WebElement btnExecute;
	
	@FindBy(xpath = "//div[@id=\"variant-select\"]")
	public WebElement cbVariante;
	
	@FindBy(xpath = "//span[@class=\"icon icon-font-Sign-and-Symbols          icon-check-44         \"]")
	public WebElement lbCarregado;
	
	@FindBy(xpath = "(//div[@data-column=\"188\"])[1]")
	public WebElement columnAliquotaIPI;
	
	@FindBy(xpath = "(//div[@data-column=\"188\"])[1]/span[@class=\"menu-cell icon icon-font-Sign-and-Symbols icon-down\"]")
	public WebElement menuColumnAliquotaIPI;
	
	@FindBy(xpath = "//div[text()=\"Ordenar de forma crescente\"]")
	public WebElement btnCresciente;
	
	@FindBy(xpath = "//div[text()=\"Ordenar de forma decrescente\"]")
	public WebElement btnDecresciente;
	
	@FindBy(xpath = "//li[@class=\"leftButton library-toolbar-item exe-tb-settings  \"]")
	public WebElement btnConfiguration;
	
	@FindBy(xpath = "//div[@id=\"settings-execute\"]//button")
	public WebElement btnExecuteConfigurationPanel;
	
	@FindBy(xpath = "(//div[@filter-key=\"NF_ID\"]//div[@class=\"base-input \"])[1]//input")
	public WebElement txtDocnum;
	
	@FindBy(xpath = "(//input[@name=\"row\"]//following-sibling::label)[1]")
	public WebElement chkSelectAll;
	
	@FindBy(xpath = "//span[@class=\"button-icon icon-font-Formatting-and-Tool icon-textandtext\"]")
	public WebElement btnCreateCorrection;
	
	@FindBy(xpath = "(//li[@class=\"rightButton library-toolbar-item  first \"])[2]//button")
	public WebElement btnNewInstruction;
	
	@FindBy(xpath = "//div[@class=\"select-correction-row\"]//input")
	public WebElement cbDocnumItem;
	
	@FindBy(xpath = "//div[@class=\"select-correction-column\"]//input")
	public WebElement cboField;
	
	@FindBy(xpath = "//ul[@class=\"base-select-box\"]/li[text()=\"CFOP\"]")
	public WebElement cboFieldCFOP;
	
	@FindBy(xpath = "//div[@class=\"select-correction-newVal\"]//input")
	public WebElement txtCorrectionValue;
	
	@FindBy(xpath = "//div[@class=\"dialog-buttons\"]")
	public WebElement btnGravarCorrection;
	
	@FindBy(xpath = "//span[@class=\"button-icon icon-font-Communication icon-send\"]")
	public WebElement btnSendToCorrection;
	
	@FindBy(xpath = "//div[@data-column=\"28\"and contains(@aria-label,\"Linha: 1-28.\")]")
	public WebElement divEmpresa;
	
	public ExecutePO() {

		PageFactory.initElements(driver, this);
	}
	
	public void clickOnBtnExecute() {
		click(btnExecute);
	}
	
	public void openMenuColumnAliquotaIPI() {
		sendKeys(menuColumnAliquotaIPI, Keys.ENTER);
	}
	
	public void clickOnBtnDecresciente() {
		click(btnDecresciente);	
	}
	
	public void clickOnBtnConfiguration() {
		click(btnConfiguration);	
	}
	
	public void fillOutTxtDocnum(String text) {
		sendKeys(txtDocnum, text);
	}
	
	public void clickOnBtnConfigurationPanelExecute() {
		click(btnExecuteConfigurationPanel);
	}
	
	public void clickOnSelectAll() {
		click(chkSelectAll);
	}
	
	public void clickOnCreateACorrection() {
		click(btnCreateCorrection);
	}
	
	public void clickOnBtnNewInstruction() {
		click(btnNewInstruction);
	}
	
	public void openCBField() {
		click(cboField);
	}
	
	public void selectCboFieldCFOP() {
		click(cboFieldCFOP);
	}
	
	public void fillOutTxtCorrectionValue(String text) {
		sendKeys(txtCorrectionValue, text);
	}
	
	public void clickOnBtnGravarCorrection() {
		click(btnGravarCorrection);
	}
	
	public void clickOnBtnSendToCorrection() {
		click(btnSendToCorrection);
	}
	
	
	
	
	
	
	

}
