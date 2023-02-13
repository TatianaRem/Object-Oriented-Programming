public class Post {
    public String name;
    public String passport;
    public String patronymic;
    public String phone;
    public String surname;
    public boolean subscription;
    public static FormDate birthday;

    public FormDate getBirthday() {
        return birthday;
    }

    public void setFormDate(FormDate birthday) {
        this.birthday = birthday;
    }
}

