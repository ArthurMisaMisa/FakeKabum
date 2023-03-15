package br.com.fiap.fakekabum.model;

public class Computador {

    private Fabricante fabricante;

    private Monitor monitor;

    private double preco;

    private int memoriaRam;

    private int sdd;

    private String processador;

    private String placaDeVideo;

    private String placaMae;

    private boolean placaDeVideoDedicada;

    public Computador() {
    }


    public Computador(Fabricante fabricante, String processador, String placaMae) {
        this.fabricante = fabricante;
        this.processador = processador;
        this.placaMae = placaMae;
    }

    public Computador(Fabricante fabricante, Monitor monitor, double preco, int memoriaRam, int sdd, String processador, String placaDeVideo, String placaMae, boolean placaDeVideoDedicada) {

        this.fabricante = fabricante;
        this.monitor = monitor;
        this.preco = preco;
        this.memoriaRam = memoriaRam;
        this.sdd = sdd;
        this.processador = processador;
        this.placaDeVideo = placaDeVideo;
        this.placaMae = placaMae;
        this.placaDeVideoDedicada = placaDeVideoDedicada;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public Computador setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
        return this;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Computador setMonitor(Monitor monitor) {
        this.monitor = monitor;
        return this;
    }

    public double getPreco() {
        return preco;
    }

    public Computador setPreco(double preco) {
        this.preco = preco;
        return this;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public Computador setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
        return this;
    }

    public int getSdd() {
        return sdd;
    }

    public Computador setSdd(int sdd) {
        this.sdd = sdd;
        return this;
    }

    public String getProcessador() {
        return processador;
    }

    public Computador setProcessador(String processador) {
        this.processador = processador;
        return this;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public Computador setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
        return this;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public Computador setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
        return this;
    }

    public boolean isPlacaDeVideoDedicada() {
        return placaDeVideoDedicada;
    }

    public Computador setPlacaDeVideoDedicada(boolean placaDeVideoDedicada) {
        this.placaDeVideoDedicada = placaDeVideoDedicada;
        return this;
    }
}
