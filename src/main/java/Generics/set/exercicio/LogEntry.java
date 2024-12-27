package Generics.set.exercicio;

import java.util.Date;
import java.util.Objects;

public class LogEntry {

    //Atributos
    private String userName;
    private Date moment;


    //Construtor
    public LogEntry(String userName, Date moment) {
        this.userName = userName;
        this.moment = moment;
    }


    //Metodos especiais
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(userName, logEntry.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userName);
    }
}
