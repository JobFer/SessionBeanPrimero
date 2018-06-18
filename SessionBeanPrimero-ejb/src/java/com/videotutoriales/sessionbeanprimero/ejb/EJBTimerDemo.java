package com.videotutoriales.sessionbeanprimero.ejb;

import java.util.Date;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.Schedule;

@Stateless
@LocalBean
public class EJBTimerDemo {

    @Schedule(hour = "*", minute = "*", second = "5")
    public void logMessage() {
        System.out.println("Mensaje Log método invocado a las:"
                + new Date(System.currentTimeMillis()));
    }

}
