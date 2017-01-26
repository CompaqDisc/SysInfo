package net.netherware.sysinfo.Modules;

import net.netherware.sysinfo.Util.JVM;
import net.netherware.sysinfo.Util.Sys;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Created by hb2n on 1/26/17.
 */
public class Values
        extends JPanel
{
    public Values()
    {
        setLayout(new GridLayout(10, 2, 10, 10));
        JLabel javaVersionLabel = new JLabel("Java Version: ");
        JLabel javaAuthorLabel = new JLabel("Java Vendor: ");
        JLabel javaLocationLabel = new JLabel("Java Home: ");
        JLabel javaArchLabel = new JLabel("Java Architecture: ");
        JLabel javaWrongBitLabel = new JLabel("32-bit Java on 64-bit System: ");
        JLabel osNameLabel = new JLabel("Operating System Name: ");
        JLabel osVersionLabel = new JLabel("Operating System Version: ");
        JLabel osRAMLabel = new JLabel("System RAM: ");
        JLabel osArchLabel = new JLabel("System Architecture: ");
        JLabel screenResLabel = new JLabel("Screen Resolution: ");

        JLabel javaVersion = new JLabel(JVM.getJVMVer());
        JLabel javaAuthor = new JLabel(JVM.getJVMAuthor());
        JLabel javaLocation = new JLabel(JVM.getJVMPath());
        JLabel javaArch = new JLabel(Integer.toString(JVM.getJVM()) + "-bit");
        JLabel javaWrongBit = new JLabel(Boolean.toString(JVM.wrongJVM()));
        JLabel osName = new JLabel(Sys.getOSName());
        JLabel osVersion = new JLabel(Sys.getOSVer());
        JLabel osRAM = new JLabel(Double.toString(Sys.getRAM()) + " GB");
        JLabel osArch = new JLabel(Integer.toString(Sys.getArch()) + "-bit");
        JLabel screenRes = new JLabel(Integer.toString(Sys.GetScreenWidth()) + " x " + Integer.toString(Sys.GetScreenHeight()));

        add(javaVersionLabel);
        add(javaVersion);

        add(javaAuthorLabel);
        add(javaAuthor);

        add(javaLocationLabel);
        add(javaLocation);

        add(javaArchLabel);
        add(javaArch);

        add(javaWrongBitLabel);
        add(javaWrongBit);

        add(osNameLabel);
        add(osName);

        add(osVersionLabel);
        add(osVersion);

        add(osRAMLabel);
        add(osRAM);

        add(osArchLabel);
        add(osArch);

        add(screenResLabel);
        add(screenRes);
    }
}