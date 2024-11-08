package LogicaDeProgramacao.Composicao.entities;

import Enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExFixOrder {

    //ATRIBUTOS
    private Date moment;
    private OrderStatus status;
    private ExFixClient client;
    private List<ExFixOrderItem> itemsList = new ArrayList<>();


    //CONSTRUTORES
    public ExFixOrder(){
    }

    public ExFixOrder(Date moment, OrderStatus status, ExFixClient client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    //MÉTODOS
    public void addItem(ExFixOrderItem item) {
        itemsList.add(item);
    }

    public void removeItem(ExFixOrderItem item) {
        itemsList.remove(item);
    }

    public double total(){
        return 0;
    }


    //MÉTODOS ESPECIAIS
    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public ExFixClient getClient() {
        return client;
    }
    public void setClient(ExFixClient client) {
        this.client = client;
    }
}
