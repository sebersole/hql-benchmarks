/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.benchmarks;

import javax.persistence.EntityManagerFactory;

/**
 * @author Andrea Boriero
 */
public interface BenchmarkHQLSemanticModelInterpreter {
	Object getSemanticModel(String hqlString);
	void configure(EntityManagerFactory entityManager);
}
