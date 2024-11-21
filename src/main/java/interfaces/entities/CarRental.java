package interfaces.entities;

import java.time.LocalDateTime;
import java.util.Date;

public class CarRental{

    //ATRIBUTOS
    private LocalDateTime start;
    private LocalDateTime finish;
    private Vehicle vehicle;
    private Invoice invoice;


    //CONSTRUTORES
    public CarRental() {
        super();
    }

    public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }

    //MÉTODOS ESPECIAIS
    public LocalDateTime getStart() {
        return start;
    }
    public void setStart(LocalDateTime start) {
        this.start = start;
    }
    public LocalDateTime getFinish() {
        return finish;
    }
    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public Invoice getInvoice() {
        return invoice;
    }
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
