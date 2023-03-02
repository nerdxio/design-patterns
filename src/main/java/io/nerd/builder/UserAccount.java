package io.nerd.builder;

//this is our class that we need to build
public class UserAccount {
    String firstName;
    String lastName;
    String middleName;
    String title;
    String DOB;
    String ccnNumber;
    String address;
    String accessCode;
    String emailAddress;
    String altEmailAddress;
    String phoneNumber;
    boolean weekendDelivery;

    static UserBuilder getBuilder() {
        return new UserBuilderImpl();
    }

    @Override
    public String toString() {
        return "UserAccount{ \n" +
                "firstName=" + firstName + "\n" +
                "lastName=" + lastName + "\n" +
                "middleName=" + middleName + "\n" +
                "title=" + title + "\n" +
                "DOB=" + DOB + "\n"+
                "ccnNumber=" + ccnNumber + "\n"+
                "address=" + address + "\n"+
                "accessCode=" + accessCode + "\n" +
                "emailAddress=" + emailAddress + "\n" +
                "altEmailAddress=" + altEmailAddress + "\n" +
                "phoneNumber=" + phoneNumber + "\n" +
                "weekendDelivery=" + weekendDelivery +
                "\n }";
    }
}
