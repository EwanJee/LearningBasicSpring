package com.Learning.SpringBoot.proj1;

import com.Learning.SpringBoot.proj1.game.GameRunner;
import com.Learning.SpringBoot.proj1.game.PacmanGame;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public class App01GamingBasicJava {

    public static void main(String[] args) {

        //var game = new MarioGame();
        //var game = new SuperContraGame();

        var game = new PacmanGame(); //1: Object Creation

        var gameRunner = new GameRunner(game);
        //2: Object Creation + Wiring of Dependencies
        // Game is a Dependency of GameRunner

        gameRunner.run();

    }

}
