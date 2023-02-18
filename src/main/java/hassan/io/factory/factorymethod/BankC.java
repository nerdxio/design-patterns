package hassan.io.factory.factorymethod;

public class BankC implements IBank{
    @Override
    public String withdraw() {
        return "Your request handel by BankC";
    }
}
