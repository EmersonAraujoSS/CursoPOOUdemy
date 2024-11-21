package interfaces.services;

import interfaces.entities.CarRental;
import interfaces.entities.Invoice;

import java.time.Duration;

public class RentalService {

    //ATRIBUTOS
    private Double pricePerHour;
    private Double pricePerDay;
    private TaxService taxService;


    //CONSTRUTORES
    public RentalService(){
    }

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }


    //MÉTODOS
    public void processInvoice(CarRental carRental){

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60;

        double basicPayment;
        if (hours <= 12){
            basicPayment = pricePerHour * Math.ceil(hours); //ceil = vai arredondar meu número de horas para cima
        }
        else{
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }


    //MÉTODOS ESPECIAIS
    public Double getPricePerHour() {
        return pricePerHour;
    }
    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }
    public Double getPricePerDay() {
        return pricePerDay;
    }
    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
    public TaxService getTaxService() {
        return taxService;
    }
    public void setTaxService(TaxService taxService) {
        this.taxService = taxService;
    }
}