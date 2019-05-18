package kz.kassayev.pzz.Client;

public class Client {
    private int clientId;
    private String name;

    public Client(int id, String name) {
        clientId = id;
        this.name = name;
    }

    public int getId() {
        return clientId;
    }

    public String getName() {
        return name;
    }
}
