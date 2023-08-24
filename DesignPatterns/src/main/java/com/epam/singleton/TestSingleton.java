package com.epam.singleton;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestSingleton {
	static Logger logger = LogManager.getLogger();
    public static void createInstance(){
        CandyMaker candyMaker = CandyMaker.getGlobalInstance();
        logger.info(candyMaker);
       
    }
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        service.submit(TestSingleton::createInstance);
        service.submit(TestSingleton::createInstance);
        service.submit(TestSingleton::createInstance);
        service.submit(TestSingleton::createInstance);
        service.submit(TestSingleton::createInstance);
        service.shutdown();

    }
}
