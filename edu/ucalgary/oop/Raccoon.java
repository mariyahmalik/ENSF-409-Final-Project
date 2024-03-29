package edu.ucalgary.oop;

/**
 * Raccoon is a concrete implementation of the abstract class NocturnalAnimal.
 * All Raccoon objects contain identical cleaning Tasks, regardless of if the
 * object is representative of an individual or a litter.
 * There is also a default feeding Task, but whether a Raccoon object
 * contains this Task is decided by the superclass.
 *
 * @author      Mariyah Malik
 * @author      Ethan Reed
 * @version     1.0
 * @since       0.1
 */
public class Raccoon extends NocturnalAnimal {
    // Default class values used in the creation of Task objects:
    public static final int FEEDING_TIME = 5;
    public static final int FEEDING_PREP_TIME = 0;
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
    public Raccoon(String name, int id) {
        super(name, id, "Raccoon");
        Task cleaning = new Task("Raccoon cage cleaning", 0, CLEANING_TIME, 0, 24);
        cleaning.setPatient(this);
        this.addTask(cleaning);
    }

    // Getters used by the superclass to create a feeding Task
    public int getFeedTime() { return FEEDING_TIME; }
    public int getPrepTime() { return FEEDING_PREP_TIME; }
}