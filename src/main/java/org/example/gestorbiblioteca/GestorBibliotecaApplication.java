package org.example.gestorbiblioteca;

import org.example.gestorbiblioteca.service.IUserService;
import org.example.gestorbiblioteca.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestorBibliotecaApplication implements CommandLineRunner {


    @Autowired
    private IUserService userService;

    private final static Logger LOG = LoggerFactory.getLogger(GestorBibliotecaApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(GestorBibliotecaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("se inicio el software. 1er LOG en salir .info");
        LOG.info(userService.msj());

    }
}
