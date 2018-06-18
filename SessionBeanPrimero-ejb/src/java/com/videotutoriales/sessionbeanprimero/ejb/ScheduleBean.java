package com.videotutoriales.sessionbeanprimero.ejb;

import java.util.Date;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.Schedule;

@Stateless
@LocalBean
public class ScheduleBean {

    @Schedule(hour = "*", minute = "*", second = "*/5")
    public void saluda(){
        System.out.println("Hola, son las: " + new Date(System.currentTimeMillis()));
    }
}