package list_container;

public record AssociationContainer<Employee, Membership, Person>
        (Employee employee, Membership membership, Person person) {
}
