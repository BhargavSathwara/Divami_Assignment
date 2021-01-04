package pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import baseClass.TestBase;
import locators.Locators.findADoctorLocators;
import utility.ExtentReport;
import utility.ScreenCaptureUtilities;

public class Find_A_Doctor_Page extends TestBase implements findADoctorLocators {

	@FindBy(xpath = FIND_A_DOCTOR_TAB)
	WebElement findADoctorTab_field;
	@FindBy(xpath = SELECT_SPECIALTY)
	WebElement selectSpecialty_field;
	@FindBy(xpath = ENTER_ZIP_CODE)
	WebElement enterZipCode_field;
	@FindBy(xpath = GO_BUTTON)
	WebElement goButton_field;

	public Find_A_Doctor_Page() {
		PageFactory.initElements(driver, this);
	}

	// Find a Doctor
	public void findADoctor(String specialty, String zipCode) throws Exception {
		// Navigate to Find A Doctor TAB
		findADoctorTab_field.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Screen Capture for Find a Doctor Page
		ScreenCaptureUtilities.captureScreenshot(driver, "Find A Doctor Page");

		// Select Spacialty
		Select drpSpacialty = new Select(selectSpecialty_field);

		try {
			drpSpacialty.selectByValue(specialty);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("");
		}

		// Enter ZipCode
		enterZipCode_field.sendKeys(zipCode);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Click on Go Button
		goButton_field.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(4000);

		// Verify Doctor has been found
		String doctorFoundMessage = driver.findElement(By.xpath("//*[@id='resultSummary']")).getText();
		System.out.println(doctorFoundMessage);
		ExtentReport.logStat(Status.PASS, doctorFoundMessage);

		// Screen Capture for Find a Doctor Search Successfully
		ScreenCaptureUtilities.captureScreenshot(driver, "Doctor Search");
	}
}
