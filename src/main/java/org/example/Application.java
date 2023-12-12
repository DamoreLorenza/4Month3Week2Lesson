package org.example;

import DAO.EventoDAO;
import entities.Evento;
import entities.TipoEvento;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static entities.TipoEvento.PUBBLICO;

public class Application {
    private static final EntityManagerFactory emf= Persistence.createEntityManagerFactory("gestioneEventi");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();
        EventoDAO sd = new EventoDAO(em);
        Evento oriettaBerti = new Evento("Orietta Berti",12,"imperdibile", 2000, TipoEvento.PUBBLICO);
        Evento belloFigo = new Evento("Bello Figo Gu",13,"solo per martelli", 100, TipoEvento.PUBBLICO);
        Evento albano = new Evento("albano",14,"wooow", 50, TipoEvento.PRIVATO);
sd.save(oriettaBerti);
sd.save(belloFigo);
sd.save(albano);

        long id = 3;
        Evento albanoDB = sd.findById(id);
        if (albanoDB != null) {
            System.out.println(albanoDB);
        } else {
            System.out.println( id + " non trovato");
        }

        sd.findByIdAndDelete(3);


        em.close();
        emf.close();

    }
}
