package com.example.operacionesmatematicas.tablas;

public class Multiplicar {
    private Integer num1;
    private Integer num2;
    private Integer resultado;

    public Multiplicar(Integer num1, Integer num2, Integer resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = resultado;
    }

    public Multiplicar() {
        /*Contructor Vacio*/
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public Integer getResultado() {
        return resultado;
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }


}
