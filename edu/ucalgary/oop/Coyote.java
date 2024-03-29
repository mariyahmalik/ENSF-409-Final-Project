package edu.ucalgary.oop;

/**
 * Coyote is a concrete implementation of the abstract class NocturnalAnimal.
 * All Coyote objects contain identical cleaning Tasks, regardless of if the
 * object is representative of an individual or a litter.
 * There is also a default feeding Task, but whether a Coyote object
 * contains this Task is decided by the superclass.
 *
 * @author      Mariyah Malik
 * @author      Ethan Reed
 * @version     1.0
 * @since       0.1
 */
public class Coyote extends CrepuscularAnimal {
    // Default class values used in the creation of Task objects:
    public static final int FEEDING_TIME = 5;
    public static final int FEEDING_PREP_TIME = 10;
    public static final int CLEANING_TIME = 5;

    /**
     * Passes the arguments and species name to the superclass constructor, then
     * creates and adds the default cleaning Task.
     *
     * @param  name
     *         Name of patient animal
     *
     * @param  id
     *         The animal's id in the database
     */
    public Coyote(String name, int id) {
        super(name, id, "Coyote");
        Task cleaning = new Task("Coyote cage cleaning", 0, CLEANING_TIME, 0, 24);
        cleaning.setPatient(this);
        this.addTask(cleaning);
    }

    // Getters used by the superclass to create a feeding Task
    public int getFeedTime() { return FEEDING_TIME; }
    public int getPrepTime() { return FEEDING_PREP_TIME; }
}