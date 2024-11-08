package LogicaDeProgramacao.Estrutura_For;

public class LacoForEach {

    public static void main(String[] args) {


        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        /*forEach
         for(TIPO e dou um APELIDO também "nesse caso os tipo do meus elementos do VETOR que é String" : COLEÇÃO"nesse caso é o vect"){
                <comando 1>
                <comando 2>
            }
         */
        //LEITURA: "para cada objeto 'obj' contido em vect, faça:"
        for(String obj : vect) {
            System.out.println(obj);
        }
    }
}
