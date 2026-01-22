package projeto_1;

public class Onibus extends Veiculo {
    private int assentos;

    public Onibus (String placa, int ano, int assentos){
        super(placa, ano);
        setAssentos(assentos);
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public void exibirDados(){ // quando criamos o método para o Onibus, podemos perceber que o ônibus é um veículo que possui todos os atributos de veículo, que foi reaproveitado (o método exibeDados() da superclasse Veiculo, utilizando a palavra chave super, para reaproveitar o método que já está na superclasse), e a quantidade de assentos que é um atributo específico da subclasse, que mostramos na tela por meio de um comando de impressão a parte, assim utilizando o conceito de sobreposição de métodos
        super.exibirDados();
        System.out.println("Assentos: "+assentos);
    }

    // a palavra extends que está na linha 1, serve para referenciar à superclasse Veiculo, ou seja, estamos dizendo que Onibus é uma subclasse, utilizando o conceito de herança
}
