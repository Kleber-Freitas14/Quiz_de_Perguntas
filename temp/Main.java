public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------------------------");

        //Nome da Faculdade
        System.out.println("UNIFAN - Centro Universitario Alfredo Nasser");

        //Nome do aluno
        System.out.println("Aluno: Kleber Freitas Martins");

        //Nome do professor
        System.out.println("Professor: Brenno Pimenta");

        //Fraze de boas vindas
        System.out.println("Aproveite o desafio de conhecimento!");
        System.out.println("Boa Sorte!");

        //Dizendo que será respondido 15 perguntas sobre Velozes e Furiosos
        System.out.println("O questionário e formado por 15 perguntas de multiplas escolhas.");

        System.out.println("-----------------------------------------------------------------");
//
//
        int acerto = 0;

        Questao q1 = new Questao();
        q1.pergunta = "01 - Em quantas partes são dividos o coração?";
        q1.opcaoA = "A) 2.";
        q1.opcaoB = "B) 4.";
        q1.opcaoC = "C) 5.";
        q1.opcaoD = "D) 1.";
        q1.opcaoE = "E) O coração não tem divisões!";
        q1.correta = "B";

        q1.escrevaQuestao();
        String resposta = q1.leiaResposta();
        if (q1.isCorreta(resposta)){
            acerto ++;
        }
//
//
//
        Questao q2 = new Questao();
        q2.pergunta = "02 - Qual o orgão responsável por filtrar o sague?";
        q2.opcaoA = "A) Pâncreas.";
        q2.opcaoB = "B) Fígado.";
        q2.opcaoC = "C) Ríns.";
        q2.opcaoD = "D) Medula.";
        q2.opcaoE = "E) Nenhum dos itens.";
        q2.correta = "C";

        q2.escrevaQuestao();
        resposta = q2.leiaResposta();
        if (q2.isCorreta(resposta)){
            acerto ++;
        }
//
//
//
        Questao q3 = new Questao();
        q3.pergunta = "03 - Qual o maior osso do nosso corpo? ";
        q3.opcaoA = "A) Tíbia.";
        q3.opcaoB = "B) Fêmur.";
        q3.opcaoC = "C) Mandibula.";
        q3.opcaoD = "D) Zigomatico.";
        q3.opcaoE = "E) Nenhuma das opções.";
        q3.correta = "B";

        q3.escrevaQuestao();
        resposta = q3.leiaResposta();
        if  (q3.isCorreta(resposta)){
            acerto ++;
        }
//
//
//
      System.out.println(" Você teve " + acerto + " acertos de 15 questões.");
//
//
//
    }
}