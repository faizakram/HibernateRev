package com.st.Entity;
// Generated Dec 1, 2016 3:13:42 PM by Hibernate Tools 5.2.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Excel.
 * @see com.st.Entity.Excel
 * @author Hibernate Tools
 */
@Stateless
public class ExcelHome {

	private static final Log log = LogFactory.getLog(ExcelHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Excel transientInstance) {
		log.debug("persisting Excel instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Excel persistentInstance) {
		log.debug("removing Excel instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Excel merge(Excel detachedInstance) {
		log.debug("merging Excel instance");
		try {
			Excel result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Excel findById(Integer id) {
		log.debug("getting Excel instance with id: " + id);
		try {
			Excel instance = entityManager.find(Excel.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
