import br.com.fiap.fakekabum.model.Computador;
import br.com.fiap.fakekabum.model.Fabricante;
import br.com.fiap.fakekabum.model.Monitor;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Fabricante dell = new Fabricante("Dell", "compre@dell.com.br");

        System.out.println("Nome "+ dell.getNome());
        System.out.println("email "+ dell.getEmail());

        Monitor moni = new Monitor("32 wide", 1399.99, dell);

        System.out.println("Monitor: " + moni.getFabricante().getNome());
        System.out.printf("Monitor: R$ %,.2f \n", moni.getPreco());
        System.out.println("Monitor caracteristica: " + moni.getPolegadas());

        Computador c = new Computador(dell, "i5", "Asus Aorus Wifi");

        System.out.println("*" .repeat(20));
        System.out.println("Fabricante: " + c.getFabricante().getNome());
        System.out.println("Processador: " + c.getProcessador());
        System.out.println("Placa Mae: " + c.getPlacaMae());

        System.out.println(c);


        }


    }

