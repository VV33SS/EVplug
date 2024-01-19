package net.runelite.client.plugins.toa;



public interface PluginLifecycleComponent
{

    default boolean isEnabled(net.runelite.client.plugins.toa.ToaConfig config, net.runelite.client.plugins.toa.RaidState raidState)
    {
        return true;
    }

    void startUp();

    void shutDown();

}
