package Deivydas;

/**
 * Created by vdeiv on 2017-02-23.
 */

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;

@Named
//@RequestScoped
@SessionScoped
public class PirmasKomponentas implements Serializable {

    private AntrasKomponentas antras;

    public PirmasKomponentas(){
        System.out.println("Tuscias ");
    }

    @Inject
    public PirmasKomponentas(AntrasKomponentas antras){
        this.antras = antras;
    }

    public String sakykLabas() {
        System.out.println("Mano antras komponentas " + antras.getClass().getName());
        return "Labas " + new Date() + " " + toString();
    }

    @PostConstruct
    public void init() {
        System.out.println(toString() + " constructed.");
    }

    @PreDestroy
    public void aboutToDie() {
        System.out.println(toString() + " ready to die.");
    }
}
