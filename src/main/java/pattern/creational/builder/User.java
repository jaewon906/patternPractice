package pattern.creational.builder;



public class User {
    private String name;
    private String age;
    private String email;

    User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    public String toString(){
        return "이름: " + this.name + "\n나이: " + this.age + "\n이메일: " + this.email;
    }

    public static class Builder{
        private String name;
        private String age;
        private String email;

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder age(String age){
            this.age = age;
            return this;
        }
        public Builder email(String email){
            this.email = email;
            return this;
        }
        User build(){return new User(this);}
    }
}
