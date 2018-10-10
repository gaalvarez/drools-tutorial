package org.drools.tutorial.util;

import java.util.logging.Logger;

import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.event.rule.AgendaEventListener;
import org.kie.api.event.rule.AgendaGroupPoppedEvent;
import org.kie.api.event.rule.AgendaGroupPushedEvent;
import org.kie.api.event.rule.BeforeMatchFiredEvent;
import org.kie.api.event.rule.MatchCancelledEvent;
import org.kie.api.event.rule.MatchCreatedEvent;
import org.kie.api.event.rule.RuleFlowGroupActivatedEvent;
import org.kie.api.event.rule.RuleFlowGroupDeactivatedEvent;

/**
 * @author gaalvarez
 */
public class AgendaEventListenerGTM implements AgendaEventListener {

	private static Logger logger = Logger.getLogger(AgendaEventListenerGTM.class.getName());
	private static final String RULE_LABEL = "La regla: ";

	@Override
	public void matchCreated(final MatchCreatedEvent event) {
		logger.info(RULE_LABEL + event.getMatch().getRule().getName() + " se ha agregado a la agenda");
	}

	@Override
	public void matchCancelled(final MatchCancelledEvent event) {
		logger.info(RULE_LABEL + event.getMatch().getRule().getName() + " se quita de la agenda");
	}

	@Override
	public void beforeMatchFired(final BeforeMatchFiredEvent event) {
		logger.info(RULE_LABEL + event.getMatch().getRule().getName() + " será lanzada");
	}

	@Override
	public void afterMatchFired(final AfterMatchFiredEvent event) {
		logger.info(RULE_LABEL + event.getMatch().getRule().getName() + " ha sido lanzada");
	}

	@Override
	public void agendaGroupPopped(final AgendaGroupPoppedEvent event) {
		// procese aquí el evento de necesitarlo
	}

	@Override
	public void agendaGroupPushed(final AgendaGroupPushedEvent event) {
		// procese aquí el evento de necesitarlo
	}

	@Override
	public void beforeRuleFlowGroupActivated(final RuleFlowGroupActivatedEvent event) {
		// procese aquí el evento de necesitarlo
	}

	@Override
	public void afterRuleFlowGroupActivated(final RuleFlowGroupActivatedEvent event) {
		// procese aquí el evento de necesitarlo
	}

	@Override
	public void beforeRuleFlowGroupDeactivated(final RuleFlowGroupDeactivatedEvent event) {
		// procese aquí el evento de necesitarlo
	}

	@Override
	public void afterRuleFlowGroupDeactivated(final RuleFlowGroupDeactivatedEvent event) {
		// procese aquí el evento de necesitarlo
	}
}
