package low_level.double_solution;

import high_level.Accept;

public class AcceptMax implements Accept<Double> {
    @Override
    public boolean apply(Double a, Double b) {
        if (a > b)
            return true;
        return false;
    }
}
