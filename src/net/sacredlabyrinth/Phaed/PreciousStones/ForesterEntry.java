package net.sacredlabyrinth.Phaed.PreciousStones;

import net.sacredlabyrinth.Phaed.PreciousStones.vectors.Field;

/**
 *
 * @author phaed
 */
public class ForesterEntry
{
    private Field field;
    private int count;
    private String playerName;
    private boolean landPrepared;
    private boolean processing;

    /**
     *
     * @param field
     * @param playerName
     */
    public ForesterEntry(Field field, String playerName)
    {
        this.field = field;
        this.playerName = playerName;
        this.count = 0;
    }

    /**
     * @return the field
     */
    public Field getField()
    {
        return field;
    }

    /**
     * @param field the field to set
     */
    public void setField(Field field)
    {
        this.field = field;
    }

    /**
     * @return the count
     */
    public int getCount()
    {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count)
    {
        this.count = count;
    }

    /**
     * Increment count
     */
    public void addCount()
    {
        count += 1 ;
    }

    @Override
    public boolean equals(Object obj)
    {
	if (!(obj instanceof ForesterEntry))
	    return false;

	ForesterEntry other = (ForesterEntry) obj;
	return other.getField().getX() == getField().getX() && other.getField().getY() == getField().getY() && other.getField().getZ() == getField().getZ() && other.getField().getWorld().equals(getField().getWorld());
    }

    @Override
    public int hashCode()
    {
        int hash = 3;
        hash = 23 * hash + (this.field != null ? this.field.hashCode() : 0);
        return hash;
    }

    /**
     * @return the playerName
     */
    public String getPlayerName()
    {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }

    /**
     * @return the landPrepared
     */
    public boolean isLandPrepared()
    {
        return landPrepared;
    }

    /**
     * @param landPrepared the landPrepared to set
     */
    public void setLandPrepared(boolean landPrepared)
    {
        this.landPrepared = landPrepared;
    }

    /**
     * @return the processing
     */
    public boolean isProcessing()
    {
        return processing;
    }

    /**
     * @param processing the processing to set
     */
    public void setProcessing(boolean processing)
    {
        this.processing = processing;
    }

}
