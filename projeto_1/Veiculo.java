package projeto_1;

public class Veiculo {
    protected String placa;
    protected int ano;

    public Veiculo(){

    }

    public Veiculo (String placa, int ano){
        setPlaca(placa);
        setAno(ano);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirDados(){ // no método exibe dados, printamos os dados que são comuns à veículos, ou seja, todos os tipos específicos de veículo possuem esses atributos, adicionados de alguns atributos específicos da subclasse
        System.out.println("Placa: "+placa);
        System.out.println("Ano: "+ano);
    }
}

