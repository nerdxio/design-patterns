package hassan.io.factory.abstractfactory;

public class MasterCard implements IPaymentCard{
    @Override
    public String getCardName() {
        return "Master Card";
    }

    @Override
    public String getProviderInfo() {
        return "MasterCard";
    }
}
