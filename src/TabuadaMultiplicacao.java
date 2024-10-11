public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <=10 ; i++) {
            System.out.println("%d x %d = %d".formatted(numero,i,numero*i));
        }
    }
}
