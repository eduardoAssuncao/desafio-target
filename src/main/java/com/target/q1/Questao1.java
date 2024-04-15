package com.target.q1;

public class Questao1 {
  public static void main(String[] args) {
  
    int INDICE = 13;
    int SOMA = 0;
    int K = 0;
    
    while(K < INDICE){
      K += 1;
      SOMA += K;
    }
    
    System.out.println("Valor de SOMA é: "+ SOMA);
  }
}
