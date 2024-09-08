package br.com.moneyiteasy.model;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class DataHorario {
    private final DateTimeFormatter dtf;

    public DataHorario() {
        this.dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    }

    public String getDateTime() {
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
}