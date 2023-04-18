package view;

import model.Cliente;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente paulo = new Cliente();
        paulo.setCodigo((byte) 1);
        paulo.setPontosDeFidelidade((short) 1500);
    }
}
