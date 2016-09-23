package com.dataart.web.dao;

import com.dataart.web.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
class UserDaoImpl implements UserDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void create(User user) {
        entityManager.persist(user);
    }

    @Override
    public User find(String name) {
        return entityManager.createNamedQuery("SELECT c FROM User c where c.name = :name", User.class)
                .setParameter("name", name)
                .getSingleResult();
    }
}
