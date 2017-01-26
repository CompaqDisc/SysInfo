package net.netherware.sysinfo.Modules;

import net.netherware.sysinfo.Util.JVM;
import javax.swing.JFrame;

/**
 * Created by hb2n on 1/26/17.
 */
public class Window
        extends JFrame
{
    public Window()
    {
        setTitle("SysInfo on Java " + JVM.getJVMVer() + " x" + JVM.getJVM());

        TabControl tabControl = new TabControl();
        add(tabControl);

        setDefaultCloseOperation(3);

        pack();
        setSize(480, 320);
        setVisible(true);
    }

    public static void create() {}
}
