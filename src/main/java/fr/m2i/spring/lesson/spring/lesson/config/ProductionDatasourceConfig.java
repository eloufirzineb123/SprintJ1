/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.spring.lesson.spring.lesson.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProductionDatasourceConfig implements DatasourceConfig{
    @Override
    public void setup(){
        System.out.println("Setting up datasource for Production environment");
    }
}
