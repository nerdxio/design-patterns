package hassan.io.factory.factorymethod;

public interface IBBankFactory {
    IBank getBank(String bankCode);
}
