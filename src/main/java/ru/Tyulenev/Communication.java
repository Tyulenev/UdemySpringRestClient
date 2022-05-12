package ru.Tyulenev;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.Tyulenev.Entity.Queues;
import ru.Tyulenev.Entity.Ticket;

import java.nio.charset.Charset;
import java.util.List;


@Component
public class Communication {
    @Autowired
    private RestTemplate restTemplate;

    private final String URL_GET_QUEUES = "http://localhost:8080/rest/entrypoint/branches/2/queues/";
    private final String URL_GET_TICKETS = "http://localhost:8080/rest/entrypoint/branches/2/queues/4/visits/";


    private HttpHeaders createHeaders(final String username, final String password) {
        return new HttpHeaders() {{
            String auth = username + ":" + password;
            byte[] encodedAuth = Base64.encodeBase64(
                    auth.getBytes(Charset.forName("US-ASCII")));
            String authHeader = "Basic " + new String(encodedAuth);
            set("Authorization", authHeader);
        }};
    }

    public List<Queues> showAllQueues() {
        ResponseEntity<List<Queues>> responseEntity =
                restTemplate.exchange(
                        URL_GET_QUEUES,
                        HttpMethod.GET,
                        new HttpEntity(createHeaders("superadmin", "ulan")),
                        new ParameterizedTypeReference<List<Queues>>() {});

        List<Queues> allQueues = responseEntity.getBody();
        System.out.println("ALL QUES:");
        for (Queues q:allQueues)
        {
            System.out.println(q);
        }

        return allQueues;
    }

    public List<Ticket> getAllTickets() {
        ResponseEntity<List<Ticket>> responseEntity =
                restTemplate.exchange(
                        URL_GET_TICKETS,
                        HttpMethod.GET,
                        new HttpEntity(createHeaders("superadmin", "ulan")),
                        new ParameterizedTypeReference<List<Ticket>>() {});

        List<Ticket> allTickets = responseEntity.getBody();
        System.out.println("ALL Tickets:");
        for (Ticket t:allTickets)
        {
            System.out.println(t);
        }

        return allTickets;
    }



    public Queues getQueue(int id) {

        return null;
    }

    public void saveQueue(Queues q1){

    }

    public void deleteQue() {

    }
}
