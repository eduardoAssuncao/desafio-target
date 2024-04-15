package com.target.q2;

public class Questao2 {
  public static void main(String[] args) {
    int valor = 55, valorAtual = 0, proximoValor = 1;

    while (valorAtual < valor) {
      int temp = valorAtual;
      valorAtual = proximoValor;
      proximoValor = temp + valorAtual;
      System.out.println(temp);
    }

    System.out.println("O valor está contido na sequencia de Fibonnaci? " + (valorAtual == valor));
  }
}
