package Program;

import Model.Evento;
import Service.Gerenciador;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //inicializando o scanner
        Scanner scanner = new Scanner(System.in);

        //inicializando a classe do arraylist/metodos
        Gerenciador service = new Gerenciador();

        System.out.println("Deseja cadastrar algum evento? (sim/não)");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {

            System.out.println("Quantos eventos desejam cadastrar?");
            //metodo melhor para evitar que o enter "coma" uma linha
            int resposta2 = Integer.parseInt(scanner.nextLine());

            //for para percorrer e obter os dados do model
            for (int i = 0; i < resposta2; i++) {

                System.out.println("Insira o nome do evento:");
                String nomeDoEvento = scanner.nextLine();

                System.out.println("Insira a data e horário do evento: (dd/MM/yyyy HH:mm)");
                String dataTexto = scanner.nextLine();

                DateTimeFormatter formatter =
                        DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

                LocalDateTime dataEvento =
                        LocalDateTime.parse(dataTexto, formatter);

                //sempre criar o objeto depois de preencher os dados
                Evento evento = new Evento(nomeDoEvento, dataEvento);

                service.adicionar(evento);
            }

            System.out.println("\n=== EVENTOS CADASTRADOS ===");

            //metodo com for each para listar
            service.listarEventos();

            System.out.println("Deseja remover algum evento?");
            String respostaRemocao = scanner.nextLine();

            if (respostaRemocao.equalsIgnoreCase("sim")){
                System.out.println("Digite o evento que você quer remover");
                String remocaoEvento = scanner.nextLine();
                service.remover(remocaoEvento);
            }

        //else para caso seja digitado algo além de sim
        } else {

            System.out.println("Encerrado! Nenhum evento cadastrado!");

        }
        //encerrando o scanner
        scanner.close();
    }
}