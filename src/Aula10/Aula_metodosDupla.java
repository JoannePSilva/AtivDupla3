package Aula10;

import java.util.Scanner;

public class Aula_metodosDupla {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    cabecalho();
    escolhaMenu();



}
    public static void cabecalho(){
        System.out.println("=============================Seja Bem-vindes! =================================== \n++++++++CADASTRO DEV CAP +++++++++");

    }
    public static void menu(){
        System.out.println("Escolha uma opção: \n 1-Cadastrar Desenvolvedor \n 2-Cadastrar Linguagem \n 3-Sair");
    }
    public static void escolhaMenu() {

        boolean invalido = true;
        do {
            menu();

            int opcao =numero("Digite uma opção: ");
            switch (opcao){

                case 1:
                    cadastroDev("Digite o seu nome: ");
                    cadastroDev("Digite sobrenome: ");
                    cadastroDev("Digite o nível de senioridade: ");
                    numero("Digite sua idade:");
                    invalido = true;
                    break;

                case 2 :
                    linguagem("Linguagem\n Digite dentro destas opções \n Java \n Javascript \n Phyton \n C \n PHP ");
                    cadastroDev("Digite a descrição da linguagem escolhida");
                    aplicacoes("Aplicações\n Digite dentro destas opções \n Front-End \n Back-End \n Mobile");
                    invalido = true;
                    break;
                case 3 :
                    invalido = false;
                    System.out.println("Volte sempre!");
                    break;

                    default:
                        System.out.println("Opção inválida /digite novamente");
                        invalido = true;
            }


        }while(invalido);



        }

        static String cadastroDev(String entrada){
            String texto;
            boolean valida_texto;
            do {
                System.out.println(entrada);
                texto = sc.nextLine();
                valida_texto = validaTexto(texto);

            }while(valida_texto);
            return texto;
        }

    static String aplicacoes(String entrada){

        boolean valida_aplicacao;
      do{
          System.out.println(entrada);
          String string = sc.nextLine();
          valida_aplicacao = validaAplicacao(string);
          return string;

      }while(!valida_aplicacao);

    }
    static String linguagem(String entrada){

      boolean valida_linguagem;

      do{
          System.out.println(entrada);
          String string = sc.nextLine();
          valida_linguagem = validaLinguagem(string);
          return string;

      }while (!valida_linguagem);

    }
   static int numero(String mensagem){
        boolean valida_numero;

        do {
            System.out.println(mensagem);
            int numero = Integer.parseInt(sc.nextLine());
            valida_numero = validaNumero(numero);
            return numero;

       } while (!valida_numero);

     }
     static boolean validaTexto(String texto) {
         if (texto.length() < 4) {
             System.out.println("É necessário ter mais que três caracteres");
             return true;
         } else {
             return false;
         }
     }

    static boolean validaLinguagem(String texto){
        if(texto.equals("Java") || texto.equals("Javascript") || texto.equals("Phyton") || texto.equals("C") || texto.equals("PHP")){
            return true;
        }
        System.out.println("Digite corretamente");
        return false;
    }


    static boolean validaAplicacao(String texto){
        if(texto.equals("Front-End") || texto.equals("Back-End") || texto.equals("Mobile")){
            return true;
        }
        System.out.println("Digite corretamente");
        return false;
    }
    static boolean validaNumero(int idade){
        if(idade <= 0){
            System.out.println("Digite um número maior que zero \n Digite novamente");
            return false;
        }
        return true;
    }

}





       /*
        System.out.println("=============================CADASTRO DEV CAP===================================");
        System.out.println("------------Bem vindo ao cadastro de desenvolvedores da Capgemini----------------");
        System.out.println("Escolha uma opção: \n 1-Cadastrar Desenvolvedor \n 2-Cadastrar Linguagem \n 3-Sair");
        int opcao = sc.nextInt();

        switch(opcao){
            case 1:
                String nome = "";
                boolean validacaoN = true;
                boolean validacaoS = true ;
                boolean validacaoR = true ;

                do{
                    System.out.print("Informe o nome Desenvolvedor:");
                    nome = sc.next();
                    if(nome.length() < 3){
                        System.out.println("O nome cadastrado deve ter no mínimo três caracteres");
                        System.out.println("Digite novamente\n");
                    }else{
                        validacaoN = false;
                    }
                }while(validacaoN);

                String sobrenome = "";

                do{
                    System.out.print("Informe o sobrenome do Desenvolvedor:");
                    sobrenome = sc.next();
                    if(sobrenome.length() < 3){
                        System.out.println("O sobrenome cadastrado deve ter no mínimo três caracteres");
                        System.out.println("Digite novamente \n");
                    }else{
                        validacaoS = false;
                    }
                }while(validacaoS);

                int idade = 0;

                do{
                    System.out.print("Informe a idade do Desenvolvedor:");
                    idade = sc.nextInt();
                    if(idade < 0){
                        System.out.println("A idade cadastrada deve ser superior a zero");
                        System.out.println("Digite novamente \n");
                    }else{
                        validacaoR = false;
                    }
                }while(validacaoR);

                String nivel = "";
                System.out.print("Informe Nível de Senioridade:");
                nivel = sc.next();


                System.out.println("------------Cadastrado realizado com sucesso!----------------");
                System.out.printf("Desenvolvedor: %s %s | Idade: %d | Nível de Senioridade: %s", nome, sobrenome, idade,nivel);
                break;

            case 2:
                String linguagem = " ";
                System.out.println("Informe o nome da linguagem de programção:");
                linguagem = sc.next();

                String desc = " ";
                System.out.println("Informe a descrição:");
                desc = sc.next();

                String ap = " ";
                System.out.println("Informe a aplicação:");
                ap = sc.next();

                System.out.println("-------------Linguagem Cadastrada-----------------");
                break;

            case 3:
                System.out.println("Saindo");
                break;
        }

    }

}
*/