package com.target.q5;

public class Questao5 {
  public static void main(String[] args) {
    
    String nome = "Eduardo Assuncao de Sousa";
    String[] nomeNormal = new String[nome.length()];
    
    String[] nomeInvertido = new String[nome.length()];
    
    for(int i = 0; i < nome.length(); i++){
      nomeNormal[i] = String.valueOf(nome.charAt(i));
    }
    
    int j = nome.length() - 1;
    for(int i = 0; i < nome.length(); i++){
      nomeInvertido[i] = nomeNormal[j];
      j--;
    }

    for(int i = 0; i < nome.length(); i++){
      System.out.println(nomeInvertido[i]);
    }
  }
}
