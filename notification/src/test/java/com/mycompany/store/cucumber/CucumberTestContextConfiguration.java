package com.mycompany.store.cucumber;

import com.mycompany.store.NotificationApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = NotificationApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
