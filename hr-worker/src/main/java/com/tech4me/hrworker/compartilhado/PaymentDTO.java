package com.tech4me.hrworker.compartilhado;

public class PaymentDTO {
    
    private String name;
    private Double dailyIncome;
    private Integer days;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public double getTotal() {
        return days * dailyIncome;
    }
    
}
