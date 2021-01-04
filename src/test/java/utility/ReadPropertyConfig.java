package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyConfig {
	Properties configProperty;
	Properties dataProperty;

	public ReadPropertyConfig() {
		File src = new File("./Configuration/config.properties");
		File src1 = new File("./Configuration/testdata.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			configProperty = new Properties();
			configProperty.load(fis);

			FileInputStream fis1 = new FileInputStream(src1);
			dataProperty = new Properties();
			dataProperty.load(fis1);
		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}
	}

	// Extent Report get Property
	public String getExtentReportPath() {
		String extentReport = configProperty.getProperty("EXTENT_REPORT_PATH");
		return extentReport;
	}

	// Get URL
	public String getTestURL() {
		String url = dataProperty.getProperty("TEST_URL");
		return url;
	}

	// Get By Name
	public String getByName() {
		String byName = dataProperty.getProperty("BY_NAME");
		return byName;
	}

	// Get By Specialty
	public String getSpecialty() {
		String specialty = dataProperty.getProperty("BY_SPECIALTY");
		return specialty;
	}

	// Get First Name
	public String getFirstName() {
		String firstName = dataProperty.getProperty("FIRST_NAME");
		return firstName;
	}

	// Get Last Name
	public String getLastName() {
		String lastName = dataProperty.getProperty("FIRST_NAME");
		return lastName;
	}

	// Get Address
	public String getAddress() {
		String address = dataProperty.getProperty("ADDRESS");
		return address;
	}

	// Get City
	public String getCity() {
		String city = dataProperty.getProperty("CITY");
		return city;
	}

	// Get State
	public String getState() {
		String state = dataProperty.getProperty("STATE");
		return state;
	}

	// Get Phone Number
	public String getPhoneNumber() {
		String phoneNumber = dataProperty.getProperty("PHONE_NUMBER");
		return phoneNumber;
	}

	// Get Email Address
	public String getEmailAddress() {
		String emailAddress = dataProperty.getProperty("EMAIL_ADDRESS");
		return emailAddress;
	}

	// Get DOB
	public String getDOB() {
		String dob = dataProperty.getProperty("DOB");
		return dob;
	}

	// Get Preferred Contact Time
	public String getPreferredContactTime() {
		String preferredContactTime = dataProperty.getProperty("PREFERRED_CONTACT_TIME");
		return preferredContactTime;
	}

	// Get Preferred Appointment Location
	public String getPreferredAppointmentLocation() {
		String preferredAppointmentLocation = dataProperty.getProperty("PREFERRED_APPOINTMENT_LOCATION");
		return preferredAppointmentLocation;
	}

	// Get Reason for visit Or Diagnosis
	public String getReasonForVisitOrDiagnosis() {
		String reasonForVisitOrDiagnosis = dataProperty.getProperty("REASON_FOR_VISIT_OR_DIAGNOSIS");
		return reasonForVisitOrDiagnosis;
	}

	// Get Doctor Spacilty
	public String getDoctorSearchSpacilty() {
		String doctorSearchSpacilty = dataProperty.getProperty("SELECT_SPACIALTY");
		return doctorSearchSpacilty;
	}
}