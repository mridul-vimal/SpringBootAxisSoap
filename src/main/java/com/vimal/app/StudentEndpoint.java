package com.vimal.app;

import com.vimal.app.soap.Student;
import com.vimal.app.soap.StudentDetailsRequest;
import com.vimal.app.soap.StudentDetailsResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@Slf4j
public class StudentEndpoint {

    private static final String NAMESPACE_URI = "http://www.howtodoinjava.com/xml/school";
    @PayloadRoot(namespace =NAMESPACE_URI,localPart = "StudentDetailsRequest")
    @ResponsePayload
    public StudentDetailsResponse getStudent(@RequestPayload StudentDetailsRequest request) {
        log.info("StudentDetailsRequest {}",request);
        StudentDetailsResponse response = new StudentDetailsResponse();
        response.setStudent(Student.builder().name("Mridul Vimal").address("Pune").standard(12).build());
        return response;
    }
}
