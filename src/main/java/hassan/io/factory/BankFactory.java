package hassan.io.factory;

public class BankFactory implements IBBankFactory{

    @Override
    public IBank getBank(String bankCode) {
        return switch (bankCode) {
            case "123456" -> new BankA();
            case "111111" -> new BankB();
            case "222222" -> new BankC();
            default -> null;
        };
    }

}
