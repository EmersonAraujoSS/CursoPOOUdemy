package LogicaDeProgramacao.FuncoesParaString;

public class split {

    public static void main(String[] args) {

        String s = "potato apple lemon";

        String[] vect = s.split(" "); // split = ele vai separar conforme a posição que eu definir

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
