package candidatura.caso4;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivoCaso4 {
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

                contatoCandidato(candidato);
            }
        }
    }

    static boolean candidatoAprovado(double salárioPretendido) {
        final double salárioBase = 2000.0;

        return (salárioPretendido <= salárioBase) ? true : false;
    }

    static void contatoCandidato(String candidato){
        boolean conseguiuContato = false;
        int tentativas;

        for (tentativas = 1; tentativas <= 3; tentativas++){
            if(atender()){
                conseguiuContato = true;
                break;
            }
        }
        String mensagem = (conseguiuContato) ? "CONSEGUIMOS CONTATO COM " + candidato + " APÓS " + tentativas + " TENTATIVA(S)" : "NÃO CONSEGUIMOS CONTATO COM O " + candidato;    
        System.out.println(mensagem);
    }

    // Método que simula o valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    //método auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}
}
