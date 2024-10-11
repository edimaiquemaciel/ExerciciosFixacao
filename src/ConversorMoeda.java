public class ConversorMoeda implements ConversaoFinanceira {
    double real;
    double dolar;
    double cotacaoAtual = 5.46;


    public double getReal() {
        return real;
    }

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    @Override
    public void converterDolarParaReal(double dolar) {
        real = dolar * cotacaoAtual;
        System.out.println("O valor em Reais é: "+real);
    }
}
