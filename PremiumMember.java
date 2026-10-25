public class PremiumMember extends Member {
    public PremiumMember(int id, String name) {
        super(id, name);
    }

    @Override
    public int getBorrowLimit() { return 5; }

    @Override
    public int getBorrowDays() { return 28; }

    @Override
    public String getType() { return "Premium"; }
}
