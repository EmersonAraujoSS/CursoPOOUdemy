package interfaces.services;

public class PaypalServiceEx2 implements OnlinePaymentServiceEx2{


    @Override
    public double paymentFee(double amount) {
        return amount * 0.02;
    }

    @Override
    public double interest(double amount, int months) { //juros
        return amount * 0.01 * months;
    }
}
