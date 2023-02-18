package hassan.io.builder;

public interface UserBuilder {
    UserAccount build() throws Exception;

    UserBuilder setFirstName(String firstName);
    UserBuilder setLastName(String lastname);
    UserBuilder setMiddleName(String middleName);
    UserBuilder setTitle(String title);
    UserBuilder setDOB(String dob);
    UserBuilder setCcNumber(String ccNumber);
    UserBuilder setAddress(String address);
    UserBuilder setAccessCode(String accessCode);
    UserBuilder setEmailAddress(String emailAddress);
    UserBuilder setAltEmailAddress(String altEmailAddress);
    UserBuilder setPhoneNumber(String phoneNumber);
    UserBuilder setWeekendDelivery(boolean weekendDelivery);
}
