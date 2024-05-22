package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {

    public static void main(String[] args) {

        //Lista de Numeros inteiros = Integer
        List<Integer> list;


        //ARRAYLIST é uma classe de implementação do array bastante otimizada
        List<String> list1 = new ArrayList<>();  //Instanciacao da lista
        list1.add("Emerson");
        list1.add("Araujo");
        list1.add("Santos");
        list1.add("Silva");

        list1.add(2, "Marco");  // Aqui ele está adicionado o nome Marco na posição 2
        System.out.println(list1.size());  // Aqui ele me retorna o tamanho da minha lista
        list1.remove("Santos"); //Aqui ele remove o elemento da lista
        list1.removeIf(x -> x.charAt(0) == 'M');  //Aqui ele vai tentar remover o M que está na posição zero, se for verdadeiro ele remove

        for (String x : list1) {    // o " : " significa que ele pertence a list1
            System.out.println(x);
        }
        System.out.println("===============================");
        System.out.println("Index of Emerson: " + list1.indexOf("Emerson")); //Aqui é para eu encontrar a posiçao de um elemento (uso o INDEXOF)
        System.out.println("===============================");

        //Aqui eu estou filtrando na minha lista  o que tem o nome que começa com a letra "A"
        //Tenho que declarar uma nova lista primeiro, uso o stream e filter, uso a minha expressao lambda "(x -> x.charAt(0) == 'A')" e no final uso o "collect"
        List<String> result = list1.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("===============================");

        //Aqui é para eu filtar e encontrar o primeiro elemento que começa com a letra "A"
        String name = list1.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}


