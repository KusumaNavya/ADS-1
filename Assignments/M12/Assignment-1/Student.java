/**
 * Class for student.
 */
class Student implements Comparable<Student> {
    private String name;
    private int dob;
    private int marks1;
    private int marks2;
    private int marks3;
    private int total;
    private String category;
    /**
     * Constructs the object.
     *
     * @param      namee      The namee
     * @param      dobb       The dobb
     * @param      marks11    The marks 11
     * @param      marks22    The marks 22
     * @param      marks33    The marks 33
     * @param      totall     The totall
     * @param      categoryy  The categoryy
     */
    Student(final String namee, final int dobb, final int marks11, final int marks22, final int marks33, final int totall, final String categoryy) {
        this.name = namee;
        this.dob = dobb;
        this.marks1 = marks11;
        this.marks2 = marks22;
        this.marks3 = marks33;
        this.total = totall;
        this.category = categoryy;
    }
    /**
     * { function_description }
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(final Student that) {
        if (this.total > that.total) {
            return -1;
        }
        if (this.total < that.total) {
            return +1;
        }
        if (this.marks3 > that.marks3) {
            return -1;
        }
        if (this.marks3 < that.marks3) {
            return +1;
        }
        if (this.marks2 > that.marks2) {
            return -1;
        }
        if (this.marks2 < that.marks2) {
            return +1;
        }
        if (this.dob > that.dob) {
            return -1;
        }
        if (this.dob < that.dob) {
            return +1;
        }
        return 0;
    }
}