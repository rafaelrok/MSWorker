package com.tech4me.hrworker.view.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class WorkeRequest {

    @NotBlank(message = "O nome deve possuir caracteres não brancos")
    @NotEmpty(message = "O nome deve ser preenchido")
    @Size(min = 5, message = "O nome deve ter, no mínimo, 5 caracteres")
    private String name;

    @NotBlank(message = "O Salario deve conter apenas numeros")
    @NotEmpty(message = "O Salario deve ser preenchido")
    private Double dailyIncome;


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

    
    
}
