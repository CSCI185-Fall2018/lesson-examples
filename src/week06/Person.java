package week06;

public class Person
{

    enum Gender {Male, Female}
    enum Color {Red, Green, Blue, Brown, Orange}

    protected String first_name;
    protected String last_name;

    protected String date_of_birth;
    protected Gender gender;
    protected int height;
    protected Color eye_color;

    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public String getDateOfBirth() {
        return date_of_birth;
    }

    public Gender getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }

    public Color getEyeColor() {
        return eye_color;
    }

    public Person() {}

    public Person(String first_name, String last_name, String date_of_birth,
                  Gender gender, int height, Color eye_color)
    {
        this.date_of_birth = date_of_birth;
        this.eye_color = eye_color;
        this.height = height;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
    }

    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("first_name: "+first_name+"\n");
        stringBuilder.append("last_name: "+last_name+'\n');
        return stringBuilder.toString();
    }
}
