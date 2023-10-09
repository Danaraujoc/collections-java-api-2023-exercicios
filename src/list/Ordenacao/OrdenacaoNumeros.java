package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ordenacaoAscendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(ordenacaoAscendente);
            return ordenacaoAscendente;
        } else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> ordenacaoDescendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            ordenacaoDescendente.sort(Collections.reverseOrder());
            return ordenacaoDescendente;
        } else {
            throw new RuntimeException("Lista vazia!");
        }

    }

    public void exibirNumeros (){
        if (!numerosList.isEmpty()){
            System.out.println(this.numerosList);
        }else {
            System.out.println("Lista vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        System.out.println("Lista de números");
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println("Numeros em ordem Ascendente");
        System.out.println(numeros.ordenarAscendente());


        // Ordenando e exibindo em ordem descendente
        System.out.println("Numeros em ordem Descendente");
        System.out.println(numeros.ordenarDescendente());

    }
}
