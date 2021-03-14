package me.sheak.sadi.Bedrock.Events;

import org.bukkit.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkLoadEvent;

public class ChunkLoad implements Listener {

    @EventHandler
    public void onChunkLoad(ChunkLoadEvent e){
        World w = e.getWorld();
        if (w.getEnvironment().equals(World.Environment.THE_END))
            return;

        Chunk c = e.getChunk();
        int cx = c.getX() << 4;
        int cz = c.getZ() << 4;
        for (int x = cx; x < cx + 16; x++) {
            for (int z = cz; z < cz + 16; z++) {
                int y = 0;
                Location loc = new Location(w,x,y,z);

                if (!(c.getWorld().getBlockAt(loc).getType() == Material.BEDROCK) ){

                        loc.getBlock().setType(Material.BEDROCK);
                }

            }
        }

    }

}
