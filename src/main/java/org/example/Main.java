package org.example;

import java.util.Scanner;
      class Main {
          public static void main(String[] args) throws Exception {
              double peso, altura;
              Scanner scanner = new Scanner(System.in);
              String classificacao;
              int grau;
              //informe o nome
              System.out.println("Digite seu nome:");
              String nome = scanner.nextLine();
              System.out.println("");

              //digite seu peso
              System.out.println("Informe seu peso:");
              peso = scanner.nextDouble();
              System.out.println("");

              //infome sua altura
              System.out.println("Informe sua altura:");
              altura = scanner.nextDouble();
              System.out.println("");

              double imc = peso / (altura * altura);

              if (imc < 18.5) {
                  classificacao = "magreza";
                  grau = 0;
                  System.out.println("Sua classificação é: Magreza, E seu grau é: 0");
              } else if (imc >= 18.5 && imc <= 24.9) {
                  classificacao = "normal";
                  grau = 0;
                  System.out.println("Sua classificação é: Normal, E seu grau é:0");
              }
              if (imc >= 25.0 && imc <= 29.9) {
                  classificacao = "sobrepeso";
                  grau = 1;
                  System.out.println("Sua classificação é: Sobrepeso, E seu grau é: 1");
              } else if (imc >= 30 && imc <= 39.9) {
                  classificacao = "obesidade";
                  grau = 2;
                  System.out.println("Sua classificação é: Obesidade, E seu grau é: 2");
              }
              if (imc > 40) {
                  classificacao = "obesidade grave";
                  grau = 3;
                  System.out.println("Sua classificação é: Obesidade Grave, E seu grau é:3");
              }
              System.out.println("O IMC do "  + nome + " é: peso:"  + peso + "kg altura:"  + altura +  "cm IMC:"  + imc );

          }
      }