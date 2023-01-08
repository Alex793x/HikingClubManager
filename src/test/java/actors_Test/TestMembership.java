package actors_Test;

import actors.Membership;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

@DisplayName("Testing Membership class")
public class TestMembership {

    @Test
    @DisplayName("Test Membership Description is not Empty")
    public void testMembershipDescriptionsIsNotFalse() {
        Membership membership1 = new Membership(Membership.MembershipType.ACTIVE_ADULT, true);
        Membership membership2 = new Membership(Membership.MembershipType.INACTIVE_ADULT, true);
        Membership membership3 = new Membership(Membership.MembershipType.INACTIVE_SENIOR, true);
        Membership membership4 = new Membership(Membership.MembershipType.ACTIVE_SENIOR, true);
        Membership membership6 = new Membership(Membership.MembershipType.INACTIVE_JUNIOR, true);
        Membership membership5 = new Membership(Membership.MembershipType.ACTIVE_JUNIOR, true);

        assertFalse(membership1.getMembershipType().getDescription().isEmpty());
        assertFalse(membership2.getMembershipType().getDescription().isEmpty());
        assertFalse(membership3.getMembershipType().getDescription().isEmpty());
        assertFalse(membership4.getMembershipType().getDescription().isEmpty());
        assertFalse(membership5.getMembershipType().getDescription().isEmpty());
        assertFalse(membership6.getMembershipType().getDescription().isEmpty());
    }

    @ParameterizedTest
    @EnumSource(value = Membership.MembershipType.class)
    @DisplayName("Test Membership Description")
    public void testMembershipDescriptionEquals(Membership.MembershipType membershipType) {
        Membership membership = new Membership(membershipType, true);
        String getMembershipDescription = membership.getMembershipType().getDescription();
        System.out.println(getMembershipDescription);

        assertNotNull(getMembershipDescription);
    }

    @ParameterizedTest
    @EnumSource(value = Membership.MembershipType.class)
    @DisplayName("Test Membership Fee")
    public void testMembershipFee(Membership.MembershipType membershipType) {
        Membership membership = new Membership(membershipType, true);
        double getFee = membership.getMembershipType().getFee();
        System.out.println(getFee);

        assertNotEquals(0.00, getFee);
    }

    @ParameterizedTest
    @EnumSource(value = Membership.MembershipType.class)
    @DisplayName("Test All MembershipTypes")
    public void testMembershipType(Membership.MembershipType membershipType) {
        Membership membership = new Membership(membershipType, true);
        assertTrue(membership.getMembershipType().getDeclaringClass().isEnum());
    }

    @Test
    @DisplayName("Test Membership has paid option")
    public void testMembershipHasPaid() {
        Membership membership = new Membership(Membership.MembershipType.ACTIVE_ADULT, true);
        assertTrue(membership.isHasPaid());

        membership.setHasPaid();
        assertFalse(membership.isHasPaid());
    }


}
