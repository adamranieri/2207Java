package dev.ranieri.app;

import io.leego.banana.BananaUtils;

public class App {

    public static void main(String[] args) {
        System.out.println("hello");
        String banner = BananaUtils.bananaify("Hello Everyone!!!");
        System.out.println(banner);
    }
}
