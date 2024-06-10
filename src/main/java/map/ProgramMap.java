package map;

import java.util.Map;
import java.util.TreeMap;

public class ProgramMap {

    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();  //No método MAP, eu tenho que passar a chave e o valor (nesse exemplo String)
                                                        //O TreeMap ele ordena por chave (no caso de String ele ordena por ordem alfabética)
        cookies.put("username", "Maria");  //PUT = serve para eu inserir dados (nesse exemplo username é minha chave e Maria é o valor da chave)
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "993975056");

        cookies.remove("email");  //aqui eu estou removendo pela minha chave, nesse caso a minha chave é email
        cookies.put("phone", "993975077"); //aqui eu estou repetindo a chave phone, então ele vai sobrescrever a chave

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone")); //aqui ele está verificando se tem a mesma chave phone e me retorna true ou false
        System.out.println("Phone number: " + cookies.get("phone")); //aqui estou buscando o valor da minha chave
        System.out.println("Email: " + cookies.get("email")); //aqui eu estou buscando um elemento que não existe
        System.out.println("Size: " + cookies.size()); //aqui eu estou buscando o tamanho do meu método

        System.out.println("ALL COOKIES: ");
        for (String key : cookies.keySet()){ //LEITURA: para cada String key no meu conjunto de chaves cookies.keySet
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
