package br.com.fatecararas.fatechelper.model.entities;


public enum DiaDaSemana {
    DOMINGO("Domingo"),
    SEGUNDA("Segunda-feira"),
    TERCA("Terça-feira"),
    QUARTA("Quarta-feira"),
    QUINTA("Quinta-feira"),
    SEXTA("Setta-feira"),
    SABADO("Sábado");



    private String dia;

    public String getDia() {
        return dia;
    }

    DiaDaSemana(String dia) {
        this.dia = dia;
    }
}
