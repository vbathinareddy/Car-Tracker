package io.tar.repository;

import com.sun.org.apache.regexp.internal.RE;
import io.tar.entity.Readings;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ReadingRepositoryImpl implements ReadingRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public Readings create(Readings R) {
        entityManager.persist(R);
        return R;
    }

}