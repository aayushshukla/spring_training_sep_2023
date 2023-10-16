package com.infosys.AopDemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.beans.Vehicle;
import com.infosys.service.VehicleService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Vehicle vs = context.getBean(Vehicle.class);
        vs.start();
        vs.stop("fuel is getting low please stop");
        vs.problem();
    }
}
