package DataTypes;

public class Persona {
    public String Givenname;
    public String Lastname;
    protected Integer Age;
    private String Sex;
    private Integer Weight;

    public void setSex(String sex) {
        Sex = sex;
    }

    public void setWeight(Integer weight) {
        Weight = weight;
    }

    public String getSex() {
        return Sex;
    }

    public Integer getWeight() {
        return Weight;
    }

}
