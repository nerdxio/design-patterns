package hassan.io.factory;

public class BankA implements IBank{
    @Override
    public String withdraw() {
        return "Your request handling by BankA";
    }
}
