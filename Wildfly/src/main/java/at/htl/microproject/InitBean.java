package at.htl.microproject;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Singleton
@Startup
public class InitBean {
    @Inject
    private PupilFacade pupilFacade;
    @Inject
    private PetFacade petFacade;

    @PostConstruct
    public void init(){
        pupilFacade.save(new Pupil("Max","Oberaigner"));
        petFacade.save(new Pet("Test",10,"male"));
    }
}
