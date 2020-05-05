package org.drools.tutorial.main;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.drools.tutorial.model.Item;
import org.drools.tutorial.model.Person;
import org.kie.api.KieServices;
import org.kie.api.event.rule.DebugAgendaEventListener;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class PoinstDemo {

	public static final void main(String[] args) {
		try {
			// load up the knowledge base
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-points");

			// go !
			
			/*1.020.000
			 * total compra: 102
			 * puntos por cada 20 items: 5
			 * puntos por valor > 500000: 10
			 * 
			 * 
			 * */
			List<Item> items = new ArrayList<Item>() {
				private static final long serialVersionUID = -1853656857123072351L;
				{
					add(new Item(new BigDecimal("20000"), 21L, Item.Type.HOME));
					add(new Item(new BigDecimal("50000"), 1L, Item.Type.CLOTHES));
					add(new Item(new BigDecimal("550000"), 1L, Item.Type.TECHNOLOGY));
				}
			};
			for (Item item : items) {
				kSession.insert(item);
			}
			final List<Long> points = new ArrayList<>();
//			kSession.addEventListener( new AgendaEventListenerGTM() );
//			kSession.addEventListener( new DebugAgendaEventListener() );
			kSession.setGlobal("points", points);
//			kSession.getAgenda().getAgendaGroup("init-sum").setFocus();
			kSession.fireAllRules();
			final Long totalPuntos = points.stream().mapToLong(p -> p).sum();
			System.out.println("Total de puntos: " + totalPuntos);
			
			

			kSession.dispose();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

}
