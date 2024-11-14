package LogicaDeProgramacao.Composicao.entities;

import Enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ExFixOrder {

    //ATRIBUTOS
    private Date moment;
    private ExFixOrderStatus status;
    private ExFixClient client;
    private List<ExFixOrderItem> itemsList = new ArrayList<>();


    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    //CONSTRUTORES
    public ExFixOrder(){
    }

    public ExFixOrder(Date moment, ExFixOrderStatus status, ExFixClient client) {
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

        double soma = 0;
        for (ExFixOrderItem item : itemsList) {
            soma += item.subTotal();
        }
        return soma;
    }


    //MÉTODOS ESPECIAIS
    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public ExFixOrderStatus getStatus() {
        return status;
    }
    public void setStatus(ExFixOrderStatus status) {
        this.status = status;
    }
    public ExFixClient getClient() {
        return client;
    }
    public void setClient(ExFixClient client) {
        this.client = client;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); //StringBuilder = serve para quando vc tiver que montar um string muito grande, a partir de vários pequenos, porque essa classe é otimizada para isso
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (ExFixOrderItem item : itemsList) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();  //NO FINAL EU SÓ CONVERTO O StringBuilder PARA toString
    }
}
