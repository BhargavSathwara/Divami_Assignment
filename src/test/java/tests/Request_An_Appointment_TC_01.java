package tests;

import org.testng.annotations.Test;

import baseClass.TestBase;
import pageObject.Request_An_Appointment_Page;
import utility.ExtentReport;
import utility.ReadPropertyConfig;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Request_An_Appointment_TC_01 extends TestBase {

	ReadPropertyConfig readPro = new ReadPropertyConfig();
	String testURL = readPro.getTestURL();
	String byName = readPro.getByName();
	String bySpecialty = readPro.getSpecialty();
	String firstName = readPro.getFirstName();
	String lastName = readPro.getLastName();
	String address = readPro.getAddress();
	String city = readPro.getCity();
	String state = readPro.getState();
	String phoneNumber = readPro.getPhoneNumber();
	String emailAddress = readPro.getEmailAddress();
	String dob = readPro.getDOB();
	String preferredContactTime = readPro.getPreferredContactTime();
	String preferredAppontmentLocation = readPro.getPreferredAppointmentLocation();
	String reasonForVisit = readPro.getReasonForVisitOrDiagnosis();

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Start Test: Request_An_Appointment_TC_01");

		// Launch Browser and Open Test URL
		openURL(testURL);
	}

	@Test
	public void request_An_Appointment_TC_01() throws Exception {
		ExtentReport.initialisation("Request_An_Appointment_TC_01");
		Request_An_Appointment_Page appointmentPage = new Request_An_Appointment_Page();

		// Request An Appointment
		appointmentPage.requestAnAppointment(byName, bySpecialty);

		// Enter Patient Information
		appointmentPage.enterPatientInformation(firstName, lastName, address, city, state, phoneNumber, emailAddress,
				dob, preferredContactTime, preferredAppontmentLocation, reasonForVisit);
	}

	@AfterMethod
	public void afterMethod() {
		closeBrowser();
		System.out.println("End Test: Request_An_Appointment_TC_01");
	}
}