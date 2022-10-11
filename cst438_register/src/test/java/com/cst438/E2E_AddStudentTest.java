package com.cst438;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.cst438.domain.Student;
import com.cst438.domain.StudentDTO;



public class E2E_AddStudentTest {

	public static final String CHROME_DRIVER_FILE_LOCATION = "C:/chromedriver_win32/chromedriver.exe";
	public static final String URL = "http://localhost:3000";
	public static final String ALIAS_NAME = "test";
	public static final int SLEEP_DURATION = 1000; // 1000 is equivalent to 1 second
	
	
	@Test
	public void addStudentSuccess() throws Exception{
		// set the driver location and start driver
		//@formatter:off
		//
		// browser	property name 				Java Driver Class
		// -------  ------------------------    ----------------------
		// Edge 	webdriver.edge.driver 		EdgeDriver
		// FireFox 	webdriver.firefox.driver 	FirefoxDriver
		// IE 		webdriver.ie.driver 		InternetExplorerDriver
		// Chrome   webdriver.chrome.driver     ChromeDriver
		//
		//@formatter:on
		
		//TODO update the property name for your browser 
		System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_FILE_LOCATION);
		//TODO update the class ChromeDriver()  for your browser
		WebDriver driver = new ChromeDriver();
		
		
		try {
			WebElement we;
			
			driver.get(URL);
			// must have a short wait to allow web page to load data
			Thread.sleep(SLEEP_DURATION);
			
			we = driver.findElement(By.name("addStudent"));
			
			we.click();
			
			Thread.sleep(SLEEP_DURATION);
			
			we = driver.findElement(By.name("studentName"));
			
			we.sendKeys("Test");
			
			we = driver.findElement(By.name("name"));
			
			we.sendKeys("david");
			
			List RadioButton = driver.findElements(By.cssSelector("input[type='radio']"));
			
			((WebElement) RadioButton.get(0)).click();
			
			we = driver.findElement(By.name("add"));
			
			we.click();
			
			Thread.sleep(SLEEP_DURATION);
			
			we = driver.findElement(By.className("Toastify_progress-bar--success"));
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		} finally {
			driver.quit();
		}
				
		
	}
}
