package org.norsys.pamela.publisher;

import org.norsys.pamela.event.CustomSpringEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
/**
 * @author panou
 * cette classe est un publisher d'evenement,
 * le publisher construit un objet "event" et le publie a tous ceux qui ecoutent
 */


public class CustomSpringEventPublisher {
	@Autowired
	// le publisher d'evenement
	public ApplicationEventPublisher applicationEventPublisher;
	
	/**
	 * etant donner que les evenements sont par defaut synchrone
	 * cette methode va bloquer jusqu'a ce que tous les listeneurs (ecouteurs) ai fini d'ecouter l'evenement
	 * @param message
	 */
	public void faisDesTrucsEtPublieDesEvenements(final String message) {
		System.out.println("Publishing custom event ...");
		//le this ici est l'instance meme de la classe
		CustomSpringEvent customSpringEvent = new CustomSpringEvent(this, message);
		applicationEventPublisher.publishEvent(customSpringEvent);
	}
}
