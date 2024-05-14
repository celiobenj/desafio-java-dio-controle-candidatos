package candidatura.caso1;

import java.util.Scanner;

public class ProcessoSeletivoCaso1 {
    // Vamos imaginar que em um processo seletivo, existe o valor base salarial de
    // R$ 2.000,00 e o salário pretentido pelo candidato. Vamos elaborar um controle
    // de fluxo onde:
    // Se o valor salário base, for maior que valor salário pretentido, imprima:
    // LIGAR PARA O CANDIDATO;
    // Senão, Se o valor salário base for igual ao valor salário pretentido, imprima:
    // LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA;
    // Senão imprima: AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        analisarCandidato(scanner.nextDouble());

    }

    static void analisarCandidato(double salárioPretendido) {

        final double salárioBase = 2000.0;

        if (salárioBase > salárioPretendido) System.out.println("LIGAR PARA O CANDIDATO");
        else if (salárioBase == salárioPretendido) System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        else System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");

    }
}