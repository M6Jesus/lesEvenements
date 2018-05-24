package org.norsys.pamela.event;

import org.springframework.context.ApplicationEvent;
/**
 * @author panou
 * simple classe d'evenement qui sera juste un endroit ou on stockera les données des evenements
 * dans ce cas ce sera juste une string
 */
public class CustomSpringEvent extends ApplicationEvent {

	private String message;
	public CustomSpringEvent(Object source, String message) {
		super(source);
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	
	
}
