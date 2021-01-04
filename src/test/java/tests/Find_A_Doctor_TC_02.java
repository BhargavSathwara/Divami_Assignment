package tests;

import org.testng.annotations.Test;

import baseClass.TestBase;
import pageObject.Find_A_Doctor_Page;
import utility.ExtentReport;
import utility.ReadPropertyConfig;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Find_A_Doctor_TC_02 extends TestBase {

	ReadPropertyConfig readPro = new ReadPropertyConfig();
	String testURL = readPro.getTestURL();
	String specialty = readPro.getDoctorSearchSpacilty();
	String zipCode = readPro.getPreferredAppointmentLocation();

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Start Test: Find_A_Doctor_TC_02");

		// Launch Browser and Open Test URL
		openURL(testURL);
	}

	@Test
	public void find_A_Doctor_TC_02() throws Exception {
		ExtentReport.initialisation("Find_A_Doctor_TC_02");
		Find_A_Doctor_Page doctorPage = new Find_A_Doctor_Page();

		// Find A Doctor
		doctorPage.findADoctor(specialty, zipCode);
	}

	@AfterMethod
	public void afterMethod() {
		closeBrowser();
		System.out.println("End Test: Find_A_Doctor_TC_02");
	}
}