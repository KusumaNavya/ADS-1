/**
 * Class for student.
 */
class Student {
    /**.
     * {rollnumber of the student}
     */
    private int rollnumber;
    /**.
     * {name of the student}
     */
    private String name;
    /**.
     * {marks obtained by the student}
     */
    private double marks;
    /**.
     *empty constructor.
     */
    Student() {
        //empty constructor
    }
    /**
     * Constructs the object.
     *
     * @param      namee   The namee
     * @param      rollno  The rollno
     * @param      markss  The markss
     */
    Student(final int rollno, final String namee,
                    final double markss) {
        this.rollnumber = rollno;
        this.name = namee;
        this.marks = markss;
    }
    /**.
     * {get method for name}
     *
     * @return     {returns name of the student}
     */
    public String getName() {
        return name;
    }
    /**.
     * {get method for marks}
     *
     * @return     {returns marks obtained by the students}
     */
    public double getMarks() {
        return marks;
    }
}
