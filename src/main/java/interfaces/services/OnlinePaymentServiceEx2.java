package interfaces.services;

public interface OnlinePaymentServiceEx2 {


    double paymentFee(double amount);

    double interest(double amount, int months);

}
