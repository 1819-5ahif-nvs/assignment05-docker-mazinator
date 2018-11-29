package at.htl.microproject;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PupilFacade {
    @PersistenceContext
    private EntityManager em;

    public void save(Pupil pupil){
        em.persist(pupil);
    }
}
