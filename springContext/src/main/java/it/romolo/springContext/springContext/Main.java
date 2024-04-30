package it.romolo.springContext.springContext;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
    	System.out.println("Ciao Romolo primo esercizio su spring Context");
    	System.out.println();
    	/**
    	 * Creazione del contesto di spring utilizzando AbstractApplicationContext ......
    	 * Gli devo passare come parametro la classe di configurazione.......
    	 * alla AnnotationConfigApplicationContext() per ottenere il constesto .....
    	 */
    	AbstractApplicationContext contesto=new AnnotationConfigApplicationContext(ConfigurazioneBean.class);
    	
    	String[] listBeans=contesto.getBeanDefinitionNames();
    	System.out.println("Questo è il contesto ecc...  "+listBeans);
    	System.out.println();
    	System.out.println("Ci sono nel contesto numero "+listBeans.length+" Bean ");
    	System.out.println("Di default , li ha creati spring stesso e la instanziati nel contesto");
    	System.out.println();
    	/**
    	 * Realizzo un ciclo per visualizzare i bean presenti nella listBeans ...
    	 */
    	System.out.println("Stampo a console tutti i bean presenti nel contesto .....");
    	for(int i=0;i<listBeans.length;i++) {
    		System.out.println(listBeans[i]);
    	}
    	System.out.println("...........................");
    	
    	
    	
    	
    	//Ricordarsi sempre di chiudere il contesto
    	contesto.close();
    	
    	
    }
}
