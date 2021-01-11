package org.example;

public class NetworkService {

    private final Network network;

    public NetworkService(Network network) {
        this.network = network;
    }

    public boolean SendMessage() {
            return network.sendMessage("ip","msg");
        }
}
