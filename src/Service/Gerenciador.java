package Service;
import Model.Evento;
import java.util.ArrayList;

public class Gerenciador {
    //criação da lista
    ArrayList<Evento> eventos = new ArrayList<>();


    //metodos de adicionar, remover e listar
    public void adicionar(Evento evento){
        eventos.add(evento);
    }


    //esse metodo percorre a lista para verificar se existe algum evento que corresponda-
    //com o que o usuário digitou, caso exista ele exclui

    public void remover(String nome){
            for (int i = 0; i < eventos.size(); i++){
                //se usar o equals tem que digitar igualmente, mas com contains basta uma palavra igual
                if (eventos.get(i).getNomeDoEvento()
                        .toLowerCase()
                        .contains(nome.toLowerCase())){

                    eventos.remove(i);

                    System.out.println("Evento removido!");

                    return;
                }
            }

        System.out.println("Evento não encontrado!");
    }

    public void listarEventos(){
        for (Evento evento : eventos ){
            System.out.println(evento);
        }
    }
}
