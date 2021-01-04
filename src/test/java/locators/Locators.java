package locators;

public interface Locators {

	public interface requestAnAppointmentLocators {
		String BY_NAME = "//*[@id='tab-tab-request-an-appointment']/section/form[1]/div[1]/input";
		String BY_SPECIALTY = "//*[@id='tab-tab-request-an-appointment']/section/form[2]/div[1]/div[1]/select";
		String NEXT_BUTTON = "//*[@id='tab-tab-request-an-appointment']/section/form[2]/div[1]/div[2]";
		String FIRST_NAME = "//input[@id='firstname']";
		String LAST_NAME = "//input[@id='lastname']";
		String ADDRESS = "//input[@id='input_addr1']";
		String CITY = "//input[@id='input_city']";
		String STATE = "//select[@id='input_state']";
		String PHONE_NUMBER = "//input[@id='phoneNumber']";
		String EMAIL_ADDRESS = "//input[@id='email']";
		String DOB = "//input[@id='dob']";
		String PREFERRED_CONTACT_TIME = "//select[@id='prefContact']";
		String PREFFERED_APPOINTMENT_LOCATION = "//input[@id='input_zip']";
		String REASON_FOR_VISIT = "//textarea[@id='resVisit']";
		String SUBMIT_BUTTON = "//button[contains(text(),'Submit')]";
	}

	public interface findADoctorLocators {
		String FIND_A_DOCTOR_TAB = "/html/body/header/div[2]/div/nav[2]/ul/li[2]/a[1]";
		String SELECT_SPECIALTY = "/html/body/div[2]/div[1]/div[1]/div/div[1]/section/div/div/div/form[1]/div[2]/div[1]/select";
		String ENTER_ZIP_CODE = "/html/body/div[2]/div[1]/div[1]/div/div[1]/section/div/div/div/form[1]/div[2]/div[2]/input";
		String GO_BUTTON = "/html/body/div[2]/div[1]/div[1]/div/div[1]/section/div/div/div/form[1]/div[2]/div[2]/div/button";
	}
}
