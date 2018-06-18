package com.videotutoriales.sessionbeanprimero.ejb;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

@Stateless
public class Repetir implements RepetirRemote {
    
    @Interceptors({LoggingInterceptor.class})
    @Override
    public String repetir(String repitiendo) {
//        return "Repitiendo: " + repitiendo;
        return "Repitiendo con interceptor: " + repitiendo;
    }

}
