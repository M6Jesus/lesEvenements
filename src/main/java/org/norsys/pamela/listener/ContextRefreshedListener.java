package org.norsys.pamela.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
/**
 * cette classe est un exemple de listener qui ecoute 
 * sur un ContextRefreshedEvent
 * @author panou
 *
 */
public class ContextRefreshedListener implements ApplicationListener<ContextRefreshedEvent> {

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("j'ecoute sur le contextRefreshedEvent");
		
	}

}
