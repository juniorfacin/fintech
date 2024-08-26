package br.com.moneyiteasy.model;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class DataHorario {
    public String getDateTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
}