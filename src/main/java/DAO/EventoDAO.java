package DAO;

import entities.Evento;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class EventoDAO {
    private final EntityManager em;
    public EventoDAO(EntityManager em){this.em=em;}

    public void save (Evento evento){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(evento);
        transaction.commit();
        System.out.println("Evento " + evento.getTitolo() + " aggiunto");

    }

    public Evento findById (long Id){
        return em.find(Evento.class, Id);
    }

    public void findByIdAndDelete (long Id){
        Evento found = this.findById(Id);
        if(found != null){
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(found);
            transaction.commit();
            System.out.println("trovato,"+" "+found.getTitolo() + "mo si eliminaa");
        } else {System.out.println("cannot find that!");
    }
}

}
