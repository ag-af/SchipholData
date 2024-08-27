package org.northcoders;

import org.northcoders.dao.SchipholDAO;

public class Main {
    public static void main(String[] args) {
        SchipholDAO.getFlights("ddec9396", "c81b2503fa2378ea5fd8710ccb91a417")
                .flights().forEach(System.out::println);
    }
}