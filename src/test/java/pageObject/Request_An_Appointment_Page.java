package pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import baseClass.TestBase;
import locators.Locators.requestAnAppointmentLocators;
import utility.ExtentReport;
import utility.ScreenCaptureUtilities;

public class Request_An_Appointment_Page extends TestBase implements requestAnAppointmentLocators {

	@FindBy(xpath = BY_NAME)
	WebElement byName_field;
	@FindBy(xpath = BY_SPECIALTY)
	WebElement bySpecialty_field;
	@FindBy(xpath = NEXT_BUTTON)
	WebElement nextButton_field;
	@FindBy(xpath = FIRST_NAME)
	WebElement firstName_field;
	@FindBy(xpath = LAST_NAME)
	WebElement lastName_field;
	@FindBy(xpath = ADDRESS)
	WebElement address_field;
	@FindBy(xpath = CITY)
	WebElement city_field;
	@FindBy(xpath = STATE)
	WebElement state_field;
	@FindBy(xpath = PHONE_NUMBER)
	WebElement phoneNumber_field;
	@FindBy(xpath = EMAIL_ADDRESS)
	WebElement emailAddress_field;
	@FindBy(xpath = DOB)
	WebElement dob_field;
	@FindBy(xpath = PREFERRED_CONTACT_TIME)
	WebElement preferredContactTime_field;
	@FindBy(xpath = PREFFERED_APPOINTMENT_LOCATION)
	WebElement preferredAppointmentLocation_field;
	@FindBy(xpath = REASON_FOR_VISIT)
	WebElement reasonForVisit_field;
	@FindBy(xpath = SUBMIT_BUTTON)
	WebElement submitButton_field;

	public Request_An_Appointment_Page() {
		PageFactory.initElements(driver, this);
	}

	// Request An Appointment
	public void requestAnAppointment(String byName, String bySpecialty) throws Exception {
		// Enter By Name
		byName_field.sendKeys(byName);
		Thread.sleep(1000);
		byName_field.sendKeys(Keys.ENTER);

		// Select By Specialty
		Select drpSpecialty = new Select(bySpecialty_field);

		try {
			drpSpecialty.selectByValue(bySpecialty);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("");
		}

		// Screenshot capture for Request An Appointment Screen
		ScreenCaptureUtilities.captureScreenshot(driver, "Request An Appointment Page");

		// Click on Next Button
		nextButton_field.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	// Enter Patient Information
	public void enterPatientInformation(String firstName, String lastName, String address, String city, String state,
			String phoneNumber, String emailAddress, String dob, String preferredContactTime,
			String preferredAppontmentLocation, String reasonForVisit) {

		// Screenshot capture for Patient Information
		ScreenCaptureUtilities.captureScreenshot(driver, "Patient Information Page");

		// Enter First Name
		firstName_field.sendKeys(firstName);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Enter Last Name
		lastName_field.sendKeys(lastName);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Enter Address
		address_field.sendKeys(address);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Enter City
		city_field.sendKeys(city);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Select State
		Select drpState = new Select(state_field);

		try {
			drpState.selectByValue(state);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("");
		}

		// Enter Phone Number
		phoneNumber_field.sendKeys(phoneNumber);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Enter Email Address
		emailAddress_field.sendKeys(emailAddress);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Enter Date Of Birth
		dob_field.sendKeys(dob);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Select Preferred Contact Time
		Select drpPreferredContactTime = new Select(preferredContactTime_field);

		try {
			drpPreferredContactTime.selectByValue(preferredContactTime);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("");
		}

		// Enter Preferred Appointment Location
		preferredAppointmentLocation_field.sendKeys(preferredAppontmentLocation);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Enter Reason For Visit
		reasonForVisit_field.sendKeys(reasonForVisit);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Click on Submit Button
		submitButton_field.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		ExtentReport.logStat(Status.PASS, "Request An Appointment Successfully !!!");
	}
}
