package com.twu.biblioteca;

public class BibliotecaApp {

    private BibliotecaView view;

    public BibliotecaApp(BibliotecaView view) {
        this.view = view;
    }

    public BibliotecaApp() {
        this.view = new BibliotecaView(System.out);
    }

    private void launch() {
        view.welcome();
    }

    public static void main(String[] args) {
        new BibliotecaApp().launch();
    }
}
