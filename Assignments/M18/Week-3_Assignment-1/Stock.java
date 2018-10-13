/**
 * Class for stock.
 */
class Stock implements Comparable<Stock> {
	/**
	 * { var_description }
	 */
	private String stock;
	/**
	 * { var_description }
	 */
	private double value;
	/**
	 * Empty Constructs
	 */
	Stock() {
		//empty constructor
	}
	/**
	 * Constructs the object.
	 *
	 * @param      stockk  The stockk
	 * @param      valuee  The valuee
	 */
	Stock(final String stockk, final double valuee) {
		this.stock = stockk;
		this.value = valuee;
	}
	/**
	 * Gets the stock.
	 *
	 * @return     The stock.
	 */
	public String getStock() {
		return this.stock;
	}
	/**
	 * Gets the value.
	 *
	 * @return     The value.
	 */
	public double getValue(){
		return this.value;
	}
	/**
	 * { function_description }
	 *
	 * @param      that  The that
	 *
	 * @return     { description_of_the_return_value }
	 */
	public int compareTo(final Stock that) {
		if (this.value > that.value) {
			return 1;
		}
		if (this.value < that.value) {
			return -1;
		} else {
			return 0;
		}	
	}
}
