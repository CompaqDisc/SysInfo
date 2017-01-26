package net.netherware.sysinfo.Util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by hb2n on 1/26/17.
 */
public class Math {
    public static double round(double value, int places)
    {
        if (places < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
