//package com.example.dependency;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service
//public class CountriesService {
//
//    @Autowired
//    private MyRepository myRepository;
//
//    public void saveCountry(){
//        Countries c = new Countries(1,"Suraj");
//        myRepository.save(c);
//    }
//
//    @Transactional
//    public Countries getCountry(){
//        Countries c = myRepository.getById(1);
//        System.out.println(c.getId());
//        return null;
//    }
//
//}
