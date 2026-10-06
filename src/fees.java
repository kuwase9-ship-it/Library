public class fees {
    private double buyFee;
    private double membershipFee;
    private double totalFees;
    private double discount;
    private double tax;
    private Member member;

    public fees(double buyFee, double membershipFee, double totalFees, double discount, double tax, Member member) {
        this.buyFee = buyFee;
        this.membershipFee = membershipFee;
        this.totalFees = totalFees;
        this.discount = discount;
        this.tax = tax;
        this.member = member;
    }
    public fees(double buyFee, double membershipFee, double totalFees, double discount, double tax) {
        this.buyFee = buyFee;
        this.membershipFee = membershipFee;
        this.totalFees = totalFees;
        this.discount = discount;
        this.tax = tax;
    }
    public fees(double buyFee, double membershipFee, double totalFees, double discount) {
        this.buyFee = buyFee;
        this.membershipFee = membershipFee;
        this.totalFees = totalFees;
        this.discount = discount;
    }
    public fees(double buyFee, double membershipFee, double totalFees) {
        this.buyFee = buyFee;
        this.membershipFee = membershipFee;
        this.totalFees = totalFees;
    }
    public fees(double buyFee, double membershipFee) {
        this.buyFee = buyFee;
        this.membershipFee = membershipFee;
    }
    public fees(double buyFee) {
        this.buyFee = buyFee;
    }

    public double getBuyFee() {
        return buyFee;
    }
    public void setBuyFee(double buyFee) {
        this.buyFee = buyFee;
    }
    public double getMembershipFee() {
        return membershipFee;
    }
    public void setMembershipFee(double membershipFee) {
        this.membershipFee = membershipFee;
    }
    public double getTotalFees() {
        return totalFees;
    }
    public void setTotalFees(double totalFees) {
        this.totalFees = totalFees;
    }
    public double getDiscount() {
        return discount;
    }
}
