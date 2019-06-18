public class employee {
    private String name;
    private double salary;
    private int seniority;

    public boolean equals(Object rhs) {
        return rhs instanceof employee && name.equals(((employee)rhs).name);
    }

    public int hashCode() {
        return name.hashCode();
    }

}
