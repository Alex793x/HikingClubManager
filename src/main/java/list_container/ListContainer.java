package list_container;

import actors.Employee;
import actors.Membership;
import actors.Person;
import destinations.Destination;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class ListContainer {

    // Attributes -------------------------
    static final ListContainer SingletonListContainer = new ListContainer();
    LinkedHashMap<Employee, Person> employeeArrayList;
    LinkedHashMap<Membership, Person> membershipArrayList;
    ArrayList<Destination> destinationArrayList;

    LinkedHashSet<AssociationContainer<Employee, Membership, Person>> associationList;

    // Constructor --------------------------
    private ListContainer() {
        employeeArrayList = new LinkedHashMap<>();
        membershipArrayList = new LinkedHashMap<>();
        destinationArrayList = new ArrayList<>();
        associationList = new LinkedHashSet<>();
    }

    // Getters ------------------------------
    public static ListContainer getInstance() {
        return SingletonListContainer;
    }

    // Setter --------------------------------
    public void setAssociationList(LinkedHashSet<AssociationContainer<Employee, Membership, Person>> associationList) {
        this.associationList = associationList;
    }
}
