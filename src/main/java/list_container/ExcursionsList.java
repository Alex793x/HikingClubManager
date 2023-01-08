package list_container;

import actors.Employee;
import actors.Membership;
import actors.Person;
import destinations.Destination;

import java.util.LinkedHashMap;

public record ExcursionsList<Guide, Participants, Trip> (
        Guide guide, Participants participants, Trip trip) {

    ExcursionsList <LinkedHashMap<Employee, Person>,LinkedHashMap<Membership, Person>,Destination> createExcursion(
            LinkedHashMap<Employee, Person> guide, LinkedHashMap<Membership, Person> participants, Destination trip) {

        return new ExcursionsList<>(guide, participants, trip);
    }
}