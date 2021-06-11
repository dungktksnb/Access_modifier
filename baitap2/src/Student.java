public class Student {
    private String name;
    private  String classes;

    public Student() {
    }

    protected String getName() {
        return name;
    }

    protected String getClasses() {
        return classes;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
