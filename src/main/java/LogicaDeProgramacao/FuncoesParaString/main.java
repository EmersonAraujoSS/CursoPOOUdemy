package LogicaDeProgramacao.FuncoesParaString;

public class main {

    public static void main(String[] args) {

        String texto = "abcde FGHIJ ABC abc DEFG    ";


        String s1 = texto.toLowerCase(); //toLowerCase = formata em letra minúsculas
        String s2 = texto.toUpperCase(); //toUpperCase = formata em letra maiúsculas
        String s3 = texto.trim(); // trim = remove os espaços do texto
        String s4 = texto.substring(2); // substring = começa da ‘string’ que eu defini
        String s5 = texto.substring(2, 9); // substring = vai buscar as string nesse meu limite definido
        String s6 = texto.replace('a', 'x'); // replace = irá trocar o "a" minúsculo por "x" (mas eu que vou definir o que eu quero mudar)
        String s7 = texto.replace("abc", "xy"); // replace = irá trocar a minha string pelo que eu defini
        int i = texto.indexOf("bc"); //indexOf = vai buscar a posição inicial
        int j = texto.lastIndexOf("bc"); // lastIndexOf = vai buscar a posição final


        System.out.println("Formatação original: -" + texto + "-");
        System.out.println("Formatação com o toLowerCase: -" + s1 + "-");
        System.out.println("Formatação com o toUpperCase: -" + s2 + "-");
        System.out.println("Formatação com o trim: -" + s3 + "-");
        System.out.println("Formatação com o substring(2): -" + s4 + "-");
        System.out.println("Formatação com o substring(2,9): -" + s5 + "-");
        System.out.println("Formatação com o replace de char('a', 'x'): -" + s6 + "-");
        System.out.println("Formatação com o replace de String(abc por xy): -" + s7 + "-");
        System.out.println("Formatação com o indexOf: " + i);
        System.out.println("Formatação com o lastIndexOf: " + j);


        //StringBuilder = serve para quando vc tiver que montar um string muito grande, a partir de vários pequenos, porque essa classe é otimizada para isso
        //append = append significa acrescentar no final
    }
}
