package com.sap.timp.pageObjectModel.BRB;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sap.timp.base.TestBase;

public class ExcluirColunaPO extends TestBase{

	
	@FindBy(xpath = "//*[@id=\"draggable-117\"]")
	public WebElement excluir;
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")
	public WebElement gravar;
	@FindBy(xpath = "//*[@id=\"report-search\"]/div/div/input")
	public WebElement coluna;
	@FindBy(xpath = "//div[@data-id=\"117\"]")
	public WebElement cst;
	
	@FindBy(xpath = "//li[@id = \"draggable-117\"]/div/div/div[@id=\"chead\"]")
	public WebElement menuC;
	@FindBy(xpath = "//*[@id=\"basePopover-wrapper\"]/div/div/div/ul/li[5]")
	public WebElement opcionC;
	
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement opcao;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	
	public ExcluirColunaPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	
	public ArrayList<Boolean> DragNDrop() {
		
		waitExpectedElement("//*[@id=\"acc-reports\"]/ul/li[3]");

		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		menu.click();
		sleep(100);
		opcao.click();

		
		waitExpectedElement("//*[@id=\"accordion\"]/ul/li");
		
		sleep(3000);
		System.out.println("paso 1");	
		Actions actions = new Actions(driver);
		
		waitExpectedElement("//*[@id=\"accordion\"]/ul/li/div/div");
		
		actions.moveToElement(excluir).perform();		

		moveToElement(excluir, driver.findElement(By.xpath("//span[text()=\"Remover\"]")));
		sleep(2000);
		
		gravar.click();
		
		sleep(2000);
		waitExpectedElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		driver.navigate().refresh();
		
		
		waitExpectedElement("//*[@id=\"accordion\"]/ul/li/div/div");
		sleep(3000);
		List<WebElement> removido = driver.findElements(By.xpath("//*[@id=\"draggable-117\"]"));
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		if(removido.size()==0){
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}

		System.out.println(sucesso);
		
		sleep(1000);
		System.out.println("paso 2");	
		coluna.sendKeys("CST ICMS");

		sleep(4000);
		
		actions.moveToElement(cst);
		sleep(3000);
		actions.doubleClick(cst).perform();
		sleep(3000);
		gravar.click();
		
		sleep(2000);
		waitExpectedElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectedElement("//*[@id=\"accordion\"]/ul/li/div/div");
		sleep(2000);

		System.out.println("paso3");
		List<WebElement> agregado = driver.findElements(By.xpath("//*[@id=\"draggable-117\"]"));
		
		if (agregado.size()>0) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}

		System.out.println(sucesso);
		
		sleep(2000);

		
		return sucesso;
		
		
		
		
	}
	
	
	public ArrayList<Boolean> ExcluirColuna() {		

		
		Actions actions = new Actions(driver);
		
		
		actions.moveToElement(excluir).perform();
		
		sleep(1000);
	
		menuC.click();
		sleep(1000);
		
		opcionC.click();
		sleep(1000);
		gravar.click();
		sleep(2000);
		waitExpectedElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		waitExpectedElement("//*[@id=\"accordion\"]/ul/li/div/div");
		
		driver.navigate().refresh();
		
		
		waitExpectedElement("//*[@id=\"accordion\"]/ul/li/div/div");
		
		List<WebElement> removido = driver.findElements(By.xpath("//*[@id=\"draggable-117\"]"));
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		if(removido.size()==0){
			sucesso.add(true);
		}
	
		sleep(1000);

		coluna.sendKeys("CST ICMS");
		
		actions.doubleClick(cst).perform();
		sleep(4000);
		gravar.click();
		sleep(2000);
		waitExpectedElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

		driver.navigate().refresh();
		
		waitExpectedElement("//*[@id=\"accordion\"]/ul/li/div/div");
		sleep(1000);
		List<WebElement> agregado = driver.findElements(By.xpath("//*[@id=\"draggable-117\"]"));
		
		if (agregado.size()>0) {
			sucesso.add(true);
		}
		
		sleep(2000);

		
		return sucesso;
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
