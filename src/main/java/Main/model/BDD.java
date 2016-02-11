package Main.model;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;

/**
 * Created by loulfy on 11/02/16.
 */
public class BDD
{
    public static enum State {LOCAL, ONLINE};

    public static VetoContext createContext(State state)
    {
        Injector injector;

        if(state == State.ONLINE) {
            injector = Guice.createInjector(new JpaPersistModule("VETO-ONLINE"), new VetoModule());
        }
        else
        {
            injector = Guice.createInjector(new JpaPersistModule("VETO-LOCAL"), new VetoModule());
        }

        PersistService ps = injector.getInstance(PersistService.class);
        ps.start();

        return injector.getInstance(VetoContext.class);
    }
}
