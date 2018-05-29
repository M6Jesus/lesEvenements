package org.norsys.pamela.listener;

import org.norsys.pamela.event.CustomSpringEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 
 * @author panou
 *Cette classe reprenste le listener
 *ce doit juste etre un simple bean qui implemente l'interface
 *ApplicationListener
 */
@Component
public class CustomSpringEventListener implements ApplicationListener<CustomSpringEvent> {

	
	@Override
	public void onApplicationEvent(CustomSpringEvent event) {
		System.out.println("receive Spring custom Event - " + event.getMessage());
		
	}

	
	
}
