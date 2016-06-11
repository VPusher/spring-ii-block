package io;

import io.models.Block;
import io.models.Project;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Florian on 23/04/15.
 */
//@Component
public class Init implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    public EntityManager entityManager;

    protected Session getCurrentSession()  {
        return entityManager.unwrap(Session.class);
    }

    @Override
    public void onApplicationEvent(final ContextRefreshedEvent event) {
        System.out.println("Hibernate many to many (Annotation)");
        Session session = this.getCurrentSession();

        session.beginTransaction();

        Project p = new Project("Awesome!");

        Block b1 = new Block(p, "Supplier 1");
        Block b2 = new Block(p, "Display 1");

        List<Block> blocks = new ArrayList<Block>();
        blocks.add(b2);

        b1.setOutputs(blocks);

        session.save(p);

        session.getTransaction().commit();
        System.out.println("Done");

        return;

    }
}
