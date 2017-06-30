package io.tar.service;

import io.tar.entity.Readings;
import io.tar.repository.ReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ReadingServiceimpl implements ReadingService{

    @Autowired
    ReadingRepository repository;
    @Transactional
    public Readings create(Readings R) {
        return repository.create(R);
    }
}
