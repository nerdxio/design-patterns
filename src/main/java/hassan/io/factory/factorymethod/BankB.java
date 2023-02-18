package hassan.io.factory.factorymethod;

public class BankB implements IBank{
    @Override
    public String withdraw() {
        return "Your request handling by BankB";
    }
}
