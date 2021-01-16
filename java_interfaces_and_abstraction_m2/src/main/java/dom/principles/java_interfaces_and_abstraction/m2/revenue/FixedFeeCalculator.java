package dom.principles.java_interfaces_and_abstraction.m2.revenue;

public class FixedFeeCalculator implements RevenueCalculator
{
    public static final double STANDARD_FEE = 500;

    private final double fee;

    public FixedFeeCalculator(final double fee)
    {
        this.fee = fee;
    }

    @Override
    public double calculate(final ClientEngagement clientEngagement)
    {
        return fee;
    }
}
