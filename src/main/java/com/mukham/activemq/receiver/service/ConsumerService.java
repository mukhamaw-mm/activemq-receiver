package com.mukham.activemq.receiver.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mukham.activemq.receiver.entity.Student;
import com.mukham.activemq.receiver.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @Author Mu Kham Aw.
 * @Description this is receive message from queue.
 */

@Component
public class ConsumerService {

    @Autowired
    StudentRepository studentRepository;

    @JmsListener(destination = "message.queue")
    public void receive(String message) {
        System.out.println("Receive Message: " + message);
        ObjectMapper mapper = new ObjectMapper();
        Student student;
        try {
            //convert json string into object
            student = mapper.readValue(message, Student.class);
            System.out.println("Student Information: " + student);

            //save into Database
            studentRepository.save(student);

            System.out.println("Successfully Save into DB.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }


    }
}
