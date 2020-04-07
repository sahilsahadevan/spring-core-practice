package com.example.sahil.java_annotation.service;

import com.example.sahil.java_annotation.sort.SortAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SortServiceImpl {

    private static final Logger LOGGER = LoggerFactory.getLogger(SortServiceImpl.class);

    private final SortAlgorithm sortAlgorithm;

    @Autowired
    public SortServiceImpl(SortAlgorithm sortAlgorithm){
        this.sortAlgorithm = sortAlgorithm;
    }

    public void sort() {
        LOGGER.info("============> Injected sortAlgorithm bean is {}", sortAlgorithm);
    }

}
