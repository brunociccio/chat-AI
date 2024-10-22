package br.com.chat_ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.theme.Theme;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
@Theme(value = "my-theme", variant = "dark")
public class ChatAiNApplication implements AppShellConfigurator {

    public static void main(String[] args) {
        // Carrega o arquivo .env
        Dotenv dotenv = Dotenv.load();

        // Inicia a aplicação Spring Boot
        SpringApplication.run(ChatAiNApplication.class, args);
    }
}

