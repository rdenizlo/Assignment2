/**
 * Ramon Deniz
 * CSE 360
 * Assignment #2
 *
 * The purpose of this class is to create a basic calculater that supports adding, subtracting, and clearing.
 * It stores all the arithmetic operations so it may be accessed later on when the user requests it.
 */


package cse360assign2;

public class AddingMachine {

    // keeps track of the total sum
    private int total;

    // keeps track of all arithmetic operations
    private String transactions;

    /**
     * Used to initialize an AddingMachine object
     */
    public AddingMachine() {
        total = 0;  // not needed - included for clarity
        transactions = "0";
    }

    /**
     * @return the total sum
     */
    public int getTotal() {
        return total;
    }

    /**
     * adds a value to the current total
     *
     * @param value, the integer being added
     */
    public void add(int value) {
        total += value;
        transactions += " + " + value;
    }

    /**
     * subtracts a value from the current total
     *
     * @param value, the integer subtracting from total
     */
    public void subtract(int value) {
        total -= value;
        transactions += " - " + value;
    }

    /**
     * @return a String representation of the arithmetic operations
     */
    public String toString() {
        return transactions;
    }

    /**
     * Resets the total and resets the String representation of the arithmetic operations
     */
    public void clear() {
        total = 0;
        transactions = "0";
    }
}
