package net.netherware.sysinfo.Modules;

import net.netherware.sysinfo.Util.Sys;
import javax.swing.JTabbedPane;

/**
 * Created by hb2n on 1/26/17.
 */
public class TabControl
        extends JTabbedPane
{
    public void setTabPlacement(int tabPlacement)
    {
        super.setTabPlacement(3);
    }

    public TabControl()
    {
        Values values = new Values();
        addTab("Reported Values from " + Sys.getDate() + " at " + Sys.getTime(), values);
    }
}
