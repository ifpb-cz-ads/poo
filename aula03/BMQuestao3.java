public class BMQuestao3 {
    public static void main(String[] args) {
        final double TAXA = 0.0825;
        double itemVenda1 = 5.95;
        double itemVenda2 = 4.50;
        double custoTotal = itemVenda1 + itemVenda2;
        double taxaCalculada = custoTotal * TAXA;
        double novoCusto = (itemVenda1 + taxaCalculada) + (itemVenda2 + taxaCalculada);
        boolean muitoCaro = novoCusto > 10;

        System.out.println("o item 1 custa: " + itemVenda1);
        System.out.println("o item 2 custa: " + itemVenda2);
        System.out.println("o custo total é: " + custoTotal);
        System.out.println("está caro? " + (muitoCaro ? "sim" : "não"));
    }
}