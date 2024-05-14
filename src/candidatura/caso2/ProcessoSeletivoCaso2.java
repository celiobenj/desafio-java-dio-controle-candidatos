package candidatura.caso2;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivoCaso2 {
    // Foi solicitado, que nosso sistema garanta que, diante das inúmeras
    // candidaturas sejam selecionados apenas no máximo, 5 candidatos para
    // entrevista, onde o salário pretendido seja menor ou igual ao salário base.

    public static void main(String[] args) {

        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE" };

        seleçãoCandidatos(candidatos);

    }

    static void seleçãoCandidatos(String[] candidatos){
        int númeroSelecionados = 1;

        for (String candidato : candidatos){
            double salárioPretendido = valorPretendido();

            if(candidatoAprovado(salárioPretendido) && númeroSelecionados <= 5){
                System.out.format("O "+númeroSelecionados+"° candidato, de nome " + candidato + ", foi aprovado! Sua pretenção salarial era de R$%.2f", salárioPretendido);
                System.out.println();
                númeroSelecionados++;
            }
        }
    }

    static boolean candidatoAprovado(double salárioPretendido) {
        final double salárioBase = 2000.0;

        return (salárioPretendido <= salárioBase) ? true : false;
    }

    // Método que simula o valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1900, 2300);
    }
}