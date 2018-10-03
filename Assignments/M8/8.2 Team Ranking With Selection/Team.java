/**
 * Class for team.
 */
class Team implements Comparable<Team> {
    /**
     * { variable teamname description }.
     */
    private String teamname;
    /**
     * { variable wins description }.
     */
    private int wins;
    /**
     * { variable losses description }.
     */
    private int losses;
    /**
     * { variable draws description }.
     */
    private int draws;
   /**
    * Constructs the object. for team
    *
    * @param      namee  The name
    * @param      winn   The window
    * @param      losee  The lose
    * @param      draww  The draw
    */
    Team(final String namee, final int winn,
        final int losee, final int draww) {
        this.teamname = namee;
        this.wins = winn;
        this.losses = losee;
        this.draws = draww;
    }
    /**
     * Gets the name.
     *
     * @return     The name.
     */
    public String getName() {
        return this.teamname;
    }
    /**
     * Gets the wins.
     *
     * @return     The wins.
     */
    public int getWins() {
        return this.wins;
    }
    /**
     * Gets the losses.
     *
     * @return     The losses.
     */
    public int getLosses() {
        return this.losses;
    }
    /**
     * Gets the draws.
     *
     * @return     The draws.
     */
    public int getDraws() {
        return this.draws;
    }
    /**
     * Sets the name.
     *
     * @param      name  The nam
     */
    public void setName(final String name) {
        this.teamname = name;
    }
    /**
     * Sets the wins.
     *
     * @param      won   The won
     */
    public void setWins(final int won) {
        this.wins = won;
    }
    /**
     * Sets the losses.
     *
     * @param      loss  The loss
     */
    public void setLosses(final int lost) {
        this.losses = lost;
    }
    /**
     * Sets the draws.
     *
     * @param      draw  The draw
     */
    public void setDraws(final int draw) {
        this.draws = draw;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return this.teamname;
    }
    /**
     * { compares to objects according to given condition }.
     *
     * @param      that  object
     *
     * @return     { returns -1 if condition satisfies else 1 }
     */
    public int compareTo(final Team that) {
        if (this.wins > that.wins) {
            return -1;
        }
        if (this.wins < that.wins) {
            return +1;
        }
        if (this.losses < that.losses) {
            return -1;
        }
        if (this.losses > that.losses) {
            return +1;
        }
        if (this.draws > that.draws) {
            return -1;
        }
        if (this.draws < that.draws) {
            return +1;
        }
        return 0;
    }
}
