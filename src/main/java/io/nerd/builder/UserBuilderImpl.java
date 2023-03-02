package io.nerd.builder;
/*
* UserBuilderImpl is ConcreteBuilder The class that implements UserBuilder
* and add the implementation log to sets and returns object */
public class UserBuilderImpl implements UserBuilder{
    UserAccount userAccount;

    public UserBuilderImpl(){
        this.userAccount=new UserAccount();
    }

    @Override
    public UserAccount build() throws Exception{
        if(userAccount.accessCode != null && !userAccount.accessCode.isEmpty()){
            if(userAccount.address == null || userAccount.address.isEmpty()){
                throw new Exception();
            }
        }
        return userAccount;
    }

    @Override
    public UserBuilder setFirstName(String firstName) {
        userAccount.firstName=firstName;
        return this;
    }

    @Override
    public UserBuilder setLastName(String lastname) {
        userAccount.lastName=lastname;
        return this;
    }

    @Override
    public UserBuilder setMiddleName(String middleName) {
        userAccount.middleName = middleName;
        return this;
    }

    @Override
    public UserBuilder setTitle(String title) {
        userAccount.title=title;
        return this;
    }

    @Override
    public UserBuilder setDOB(String dob) {
        userAccount.DOB=dob;
        return this;
    }

    @Override
    public UserBuilder setCcNumber(String ccNumber) {
        userAccount.ccnNumber=ccNumber;
        return this;
    }

    @Override
    public UserBuilder setAddress(String address) {
        userAccount.address=address;
        return this;
    }

    @Override
    public UserBuilder setAccessCode(String accessCode) {
        userAccount.accessCode=accessCode;
        return this;
    }

    @Override
    public UserBuilder setEmailAddress(String emailAddress) {
        userAccount.emailAddress=emailAddress;
        return this;
    }

    @Override
    public UserBuilder setAltEmailAddress(String altEmailAddress) {
        userAccount.altEmailAddress=altEmailAddress;
        return this;
    }

    @Override
    public UserBuilder setPhoneNumber(String phoneNumber) {
        userAccount.phoneNumber=phoneNumber;
        return this;
    }

    @Override
    public UserBuilder setWeekendDelivery(boolean weekendDelivery) {
        userAccount.weekendDelivery=weekendDelivery;
        return this;
    }
}
