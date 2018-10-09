package org.drools.tutorial.main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.drools.tutorial.model.Item;
import org.kie.api.KieServices;
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
			kSession.setGlobal("points", points);
			kSession.fireAllRules();
			kSession.dispose();
			System.out.println("Total de puntos: " + points.stream().mapToLong(p -> p).sum());
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

}
