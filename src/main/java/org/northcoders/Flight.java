package org.northcoders;

import org.northcoders.dao.AircraftType;

public record Flight(String flightName, String id, String scheduleDate, String terminal, String actualLandingTime, AircraftType aircraftType) {
}
