package actors;

/*
 *  This Class describes the membership type,
 *  and activeness of the hiking clubs members.
 */

public class Membership {

    // ENUM INNER CLASS
    public enum MembershipType {
        INACTIVE_ADULT("Inactive Adult Membership", 125.00),
        ACTIVE_ADULT("Active Adult Membership", 200.00),
        INACTIVE_SENIOR("Inactive Senior Membership", (INACTIVE_ADULT.getFee() - INACTIVE_ADULT.getFee()*0.20)),
        ACTIVE_SENIOR("Active Senior Membership", (ACTIVE_ADULT.getFee() - ACTIVE_ADULT.getFee()*0.20)),
        INACTIVE_JUNIOR("Inactive Junior Membership", 75.00),
        ACTIVE_JUNIOR("Active Junior Membership", 125.00);

        // Enum Attributes --------------------
        private final String description;
        private final double fee;

        // Enum constructor -------------------
        MembershipType(String description, double fee) {
            this.description = description;
            this.fee = fee;
        }

        // Enum getter ------------------------
        public String getDescription() {
            return description;
        }
        public double getFee() {
            return fee;
        }
    }

    // Attributes ------------------------------
    private MembershipType membershipType;
    private static int ID = 2000;
    private final int uniqueID = ID++;
    private boolean hasPaid;


    // Constructor -----------------------------
    public Membership(MembershipType membershipType, boolean hasPaid) {
        this.membershipType = membershipType;
        this.hasPaid = hasPaid;
    }

    // Getter ----------------------------------
    public MembershipType getMembershipType() {
        return membershipType;
    } // End of method

   public int getUniqueID() {
        return uniqueID;
   } // End of method

    public boolean isHasPaid() {
        return hasPaid;
    } // End of method


    // Setter ----------------------------------
    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }
    public void setHasPaid() {
        hasPaid = !hasPaid;
    }

}
