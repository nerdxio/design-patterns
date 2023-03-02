package io.nerd.builder;
// this class behave as Client
public class Demo {
    public static void main(String[] args) throws Exception {
        UserBuilder userBuilder = UserAccount.getBuilder();
        var user = userBuilder.setFirstName("hassan")
                .setLastName("refaat")
                .setEmailAddress("hassan.refaat.dev@gamil.com")
                .setAddress("saahel selahm asyut egypt")
                .setWeekendDelivery(true)
                .build();

        System.out.println(user.toString());
    }

}
