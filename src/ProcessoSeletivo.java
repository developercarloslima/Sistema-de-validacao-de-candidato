import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Paulo", "Maria", "João", "Ana", "Carlos", "Fernanda", "Lucas", "Juliana", "Roberto", "Patrícia"};
        for(String candidato : candidatos) {
            ligandoParaCandidatosSelecionados(candidato);
        }
        
        
    }

    static void ligandoParaCandidatosSelecionados(String candidato) {
        int tentativasContato = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasContato++;
                System.out.println("Tentativa " + tentativasContato + " de contato com o candidato "+ candidato);
            }

            }
            while (continuarTentando && tentativasContato < 3);
            if(atendeu) {
                System.out.println("Candidato " + candidato +" atendeu na tentativa " + tentativasContato);
            } else {
                System.out.println("Candidato " + candidato +" não atendeu após 3 tentativas.");
            }
        }

    



    static boolean atender (){
       return new Random().nextInt(3) == 1;
        

    }

    static void selecaoCadidatos(){
        String [] candidatos = {"Paulo", "Maria", "João", "Ana", "Carlos", "Fernanda", "Lucas", "Juliana", "Roberto", "Patrícia"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("Candidato: " + candidato + ", Salário Pretendido: " + salarioPretendido);
            
            if (salarioBase >= salarioPretendido) {
                candidatosSelecionados++;
                System.out.println("Candidato selecionado: " + candidato);
            } else {
                System.out.println("Candidato não selecionado: " + candidato);
            }
            candidatoAtual++;
            System.out.println("Candidatos selecionados: " + candidatosSelecionados);
            System.out.println("Candidatos restantes: " + (candidatos.length - candidatoAtual));
        
        }                
    } 
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void imprimirCandidatosSelecionados(String[] candidatosSelecionados) {
       String [] candidatos = {"Paulo", "Maria", "João", "Ana", "Carlos"};
       
        
        for (String candidato : candidatos) {
            System.out.println("Candidatos Selecionados:" + candidato);
        }
    }

    static void analisarCandidato(double salarioPretendido) {
  
        double salarioBase = 2000.00;

        if(salarioBase >= salarioPretendido) {
            System.out.println("Ligar para o candidato");
            } else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
            } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
