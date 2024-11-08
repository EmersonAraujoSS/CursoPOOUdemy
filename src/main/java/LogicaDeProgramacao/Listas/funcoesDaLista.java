package LogicaDeProgramacao.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class funcoesDaLista {

    public static void main(String[] args) {

        //INSTANCIAÇÃO DA LISTA
        List<String> list = new ArrayList<String>();

        //ADICIONAR ELEMENTOS A LISTA (.add)
        list.add("Teste1");
        list.add("Teste2");
        list.add("Teste3");
        list.add("Teste4");
        list.add("Emerson");
        list.add("Victor");
        list.add("Joseph");
        list.add(2, "Teste4"); //INSERINDO ELEMENTO NA POSIÇÃO 2

        System.out.println(list.size()); //IMPRIMIR O TAMANHO DA LISTA (.size)

        for (String x : list) { //LEITURA: "para cada String 'x' contido em list, faça:"
            System.out.println(x);
        }

        System.out.println("=================================");

        list.remove("Teste2"); //REMOVENDO DA MINHA LISTA

        list.removeIf(x -> x.charAt(0) == 'T'); //REMOVENDO COM PREDICADO (PEGA UM VALOR X QUE É DO TIPO STRING E RETORNA SE O X NA POSIÇÃO ZERO É IGUAL A T)
        for (String x : list){
            System.out.println(x);
        }

        System.out.println("=================================");

        System.out.println("Index of Emerson: " + list.indexOf("Emerson")); //ENCONTRAR POSIÇÃO DO ELEMENTO
        System.out.println("Index of Marco: " + list.indexOf("Marco")); //TENTANDO BUSCAR ELEMENTO QUE NÃO TEM NA MINHA LISTA (CASO ELE NÃO ENCONTRE, ELE RETORNA -1)

        System.out.println("=================================");
        /*
        Explicação dessa parte:
            - esse (.stream) permite que eu faça operações com expressão lâmbida
            - esse (.filter) a função filter recebe um predicado, que no caso vai ser esse filtro (x -> x.charAt(0) == 'V')
            - esse (.collect) irei usar para converter o meu stream em lista novamente, porque o stream não é compatível com list
        */
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'V').collect(Collectors.toList()); //ESSA LISTA VAI IMPRIMIR O NOME QUE COMEÇAR COM A LETRA "V" (PREDICADO)
        for (String x : result){
            System.out.println(x);
        }

        System.out.println("=================================");

        String name = list.stream().filter(x -> x.charAt(0) == 'E').findFirst().orElse(null); //VAI RETORNAR O ELEMENTO NA POSIÇÃO 0 QUE TENHA A LETRA 'E', CASO NÃO TENHA ELE RETORNA NULL
        System.out.println(name);
    }
}
