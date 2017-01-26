package net.netherware.sysinfo.Util;

import com.sun.management.OperatingSystemMXBean;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.lang.management.ManagementFactory;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by hb2n on 1/26/17.
 */
public class Sys
{
    public static String getTime()
    {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        return dateFormat.format(cal.getTime());
    }

    public static String getDate()
    {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Calendar cal = Calendar.getInstance();
        return dateFormat.format(cal.getTime());
    }

    public static double getRAM()
    {
        long RAM_Bytes = ((OperatingSystemMXBean)ManagementFactory.getOperatingSystemMXBean()).getTotalPhysicalMemorySize();
        long RAM_KBytes = RAM_Bytes / 1024L;
        double RAM_MBytes = RAM_KBytes / 1024L;
        double RAM_GBytes = RAM_MBytes / 1024.0D;
        double Gigs_RAM = Math.round(RAM_GBytes, 2);
        return Gigs_RAM;
    }

    public static int getArch()
    {
        String sysArch = System.getProperty("os.arch");

        int Arch = (sysArch.endsWith("64")) ? 64 : 32;
        return Arch;
    }

    public static String getOSName()
    {
        return System.getProperty("os.name");
    }

    public static String getOSVer()
    {
        return System.getProperty("os.version");
    }

    public static int GetScreenWorkingWidth()
    {
        return GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width;
    }

    public static int GetScreenWorkingHeight()
    {
        return GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height;
    }

    public static int GetScreenWidth()
    {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        return gd.getDisplayMode().getWidth();
    }

    public static int GetScreenHeight()
    {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        return gd.getDisplayMode().getHeight();
    }
}
