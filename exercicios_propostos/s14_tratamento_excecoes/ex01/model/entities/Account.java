package exercicios_propostos.s14_tratamento_excecoes.ex01.model.entities;

import exercicios_propostos.s14_tratamento_excecoes.ex01.model.exceptions.SaldoInsuficienteException;
import exercicios_propostos.s14_tratamento_excecoes.ex01.model.exceptions.SaqueSuperiorLimiteSaqueException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {}

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withDraw(Double amount) {
        if(amount > this.balance) {
            throw new SaldoInsuficienteException("Not enough balance");
        }
        if(amount > this.withdrawLimit) {
            throw new SaqueSuperiorLimiteSaqueException("The amount exceeds withdraw limit");
        }
        this.balance -= amount;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
}
