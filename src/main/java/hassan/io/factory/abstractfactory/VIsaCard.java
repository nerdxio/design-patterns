package hassan.io.factory.abstractfactory;

public class VIsaCard implements IPaymentCard{
    @Override
    public String getCardName() {
        return "Visa Card";
    }

    @Override
    public String getProviderInfo() {
        return "Visa";
    }
}
