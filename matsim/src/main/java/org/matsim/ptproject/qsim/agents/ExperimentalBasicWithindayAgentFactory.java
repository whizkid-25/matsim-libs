/* *********************************************************************** *
 * project: org.matsim.*
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 * copyright       : (C) 2008 by the members listed in the COPYING,        *
 *                   LICENSE and WARRANTY file.                            *
 * email           : info at matsim dot org                                *
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *   See also COPYING, LICENSE and WARRANTY file                           *
 *                                                                         *
 * *********************************************************************** */

package org.matsim.ptproject.qsim.agents;

import org.matsim.api.core.v01.population.Person;
import org.matsim.core.mobsim.framework.PersonDriverAgent;
import org.matsim.ptproject.qsim.interfaces.Netsim;

public final class ExperimentalBasicWithindayAgentFactory implements AgentFactory {

	private final Netsim simulation;

	public ExperimentalBasicWithindayAgentFactory(final Netsim simulation) {
		this.simulation = simulation;
	}

	@Override
	public PersonDriverAgent createMobsimAgentFromPerson(final Person p) {
		PersonDriverAgent agent = new ExperimentalBasicWithindayAgent(p, this.simulation);
		return agent;
	}

}
