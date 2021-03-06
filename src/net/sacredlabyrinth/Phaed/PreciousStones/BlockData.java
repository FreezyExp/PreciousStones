package net.sacredlabyrinth.Phaed.PreciousStones;

import org.bukkit.Location;
import org.bukkit.block.Block;

/**
 * @author phaed
 */
public class BlockData
{
    private final int typeId;
    private final byte data;
    private final Location location;

    /**
     * @param block
     */
    public BlockData(Block block)
    {
        this.typeId = block.getTypeId();
        this.data = block.getData();
        this.location = block.getLocation();
    }

    /**
     * @param block
     */
    public BlockData(Location loc, int typeId, byte data)
    {
        this.typeId = typeId;
        this.data = data;
        this.location = loc;
    }

    /**
     * @return the typeId
     */
    public int getTypeId()
    {
        return typeId;
    }

    /**
     * @return the data
     */
    public byte getData()
    {
        return data;
    }

    /**
     * @return the location
     */
    public Location getLocation()
    {
        return location;
    }

    /**
     * @return the block
     */
    public Block getBlock()
    {
        return location.getWorld().getBlockAt(location);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof BlockData))
        {
            return false;
        }

        BlockData other = (BlockData) obj;
        return other.getTypeId() == this.getTypeId() && other.getData() == this.getData() && Helper.isSameBlock(this.getLocation(), other.getLocation());
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 47 * hash + this.getTypeId();
        hash = 47 * hash + this.getData();
        hash = 47 * hash + this.getLocation().getBlockX() + this.getLocation().getBlockY() + this.getLocation().getBlockZ();
        return hash;
    }

    @Override
    public String toString()
    {
        return "[" + getTypeId() + ":" + getData() + " " + Helper.toLocationString(location) + "]";
    }

}
