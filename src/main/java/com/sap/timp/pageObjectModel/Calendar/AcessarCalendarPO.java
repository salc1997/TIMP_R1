package com.sap.timp.pageObjectModel.Calendar;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class AcessarCalendarPO extends TestBase{

	@FindBy(xpath = "//div[text()=\"CALENDAR\"]")
	public WebElement calendar;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement ar;
	
	@FindBy(xpath = "//span[text()=\"Calendário de Usuários\"]")
	public WebElement mostrar;
	

	public AcessarCalendarPO() {

		PageFactory.initElements(driver, this);
	}

	
	public boolean acessarCalendar() {

		waitExpectedElement("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!calendar.isDisplayed()) {
			ar.click();
		}
		sleep(1000);
		
		calendar.click();
		
		waitExpectedElement(mostrar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		boolean sucesso = mostrar.isDisplayed();
		return sucesso;
		
		
	}
	
}
