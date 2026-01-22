package projeto_1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("PVT2852", 2015);
        v1.exibirDados();

        System.out.println("\n");

        Veiculo v2 = new Onibus("HGA3048", 2005, 40);
        v2.exibirDados();

        System.out.println("\n");

        Veiculo v3 = new Caminhao("HJL1905", 2003, 50);
        v3.exibirDados();

        System.out.println("\n");

        ArrayList<Veiculo> vetVeiculos = new ArrayList<>();

        Veiculo v = new Veiculo("SDA2611", 2022);
        v.exibirDados();

        System.out.println("\n");

        Veiculo vclo = new Onibus("GVN1911", 2011, 35);
        vclo.exibirDados();

        Veiculo v5 = new Veiculo();
        v5.exibirDados();

    }
}
