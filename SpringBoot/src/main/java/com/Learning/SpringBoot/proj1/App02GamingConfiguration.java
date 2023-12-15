package com.Learning.SpringBoot.proj1;

import com.Learning.SpringBoot.proj1.game.GameRunner;
import com.Learning.SpringBoot.proj1.game.GamingConsole;
import com.Learning.SpringBoot.proj1.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App02GamingConfiguration{
    @Bean
    public GamingConsole game() {
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }
}