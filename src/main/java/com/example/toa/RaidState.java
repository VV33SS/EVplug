package net.runelite.client.plugins.toa;

import lombok.Value;
import net.runelite.client.plugins.raids.RaidRoom;

@Value
public class RaidState
{

    private final boolean inLobby;
    private final boolean inRaid;
    private final RaidRoom currentRoom;
    private final int playerCount;

}
