package com.company;


import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Funcionario{

    private String nome;
    private String sexo;
    private double salario;

    private static DecimalFormat df = new DecimalFormat("#.##");

    public Funcionario() {

    }

    public Funcionario(String nome,String sexo, double salario){
        this.nome = nome;
        this.sexo = sexo;
        //this.salario = salario;

        df.setRoundingMode(RoundingMode.UP);
        String format = df.format(salario).replace(",",".");
        this.salario = Double.valueOf(format);

    }

    public String getNome(){
        return  nome;
    }
    public String getSexo(){
        return sexo;
    }

    public double getSalario() {
        return salario;
    }
    @Override
    public String toString(){
        return nome + "   " + sexo + "   " + salario;
    }

    //public String getNome() {
    //   return nome.toUpperCase();
    //}


}