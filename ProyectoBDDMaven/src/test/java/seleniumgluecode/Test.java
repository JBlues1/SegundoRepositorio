package seleniumgluecode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {
	
	// Variable de tipo ChromeDriver
	private ChromeDriver driver = Hooks.getDriver();
	
	@Given("^el usuario se encuentra en la pagina Homa de imalittletester$")
	public void el_usuario_se_encuentra_en_la_pagina_Homa_de_imalittletester() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String titleHomaPage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
		assertEquals(titleHomaPage, driver.getTitle());
	}

	@When("^hace click sobre el boton The Little Tester Comics$")
	public void hace_click_sobre_el_boton_The_Little_Tester_Comics() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement titleComicsLocator = driver.findElement(By.id("menu-item-2008"));
		titleComicsLocator.click();
	}

	@Then("^se debe redirigir a la pantalla Comics$")
	public void se_debe_redirigir_a_la_pantalla_Comics() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement pageTitleLocator = driver.findElement(By.className("page-title"));
		assertTrue("No se redireccionó a la página de Comics", pageTitleLocator.isDisplayed());
		assertEquals("Category: comics", pageTitleLocator.getText());
	}

}
