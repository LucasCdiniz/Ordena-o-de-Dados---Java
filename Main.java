// Criado e Desenvolivdo por:
// Lucas Celestino Diniz
// lucascelestino.diniz@gmail.com

/*
    Programa que realiza a Ordenação de Dados utilizandos as ordenações:
    BubbleSort;SelectionSort;InsertionSort;QuickSort;MergeSort
    Com a possibilidade de informar dez (10) números para realizar a Ordenação que desejar
    Assim como há a possibilidade de gerar estes números aleatóriamente
    Tratamento de erro realizado para que o usuário digite apenas números e nenhuma letra
    Tratamento de erro realizado também para que o usuário não prossiga ao deixar a opção em branco
    Tratamento de erro para que o cliente digite apenas os números que estão dispostos no formulário
*/

package ordenacaodedados;

// INÍCIO DA CLASSE MAIN E A HERENÇA DA CLASSE CONTEM_AS ORDENACAO_DE_DADOS
public class Main extends Contem_as_Ordenacoes_de_Dados{ 
  
    public static void main(String[] args) { // AQUI É ONDE INICIA
        
        Contem_as_Ordenacoes_de_Dados cod = new Contem_as_Ordenacoes_de_Dados();
        cod.Executa_Ordenacao();
    }
} // FIM DA CLASSE MAIN


// Criado e Desenvolivdo por:
// Lucas Celestino Diniz
// lucascelestino.diniz@gmail.com