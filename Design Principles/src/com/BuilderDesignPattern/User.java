package com.BuilderDesignPattern;

public class User {
    private final String name;
    private final int age;
    private final String city;
    private final String job;
    private final boolean isActive;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.city = builder.city;
        this.job = builder.job;
        this.isActive = builder.isActive;
    }

    public static class Builder {
        private String name;
        private int age;
        private String city;
        private String job;
        private boolean isActive;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setJob(String job) {
            this.job = job;
            return this;
        }

        public Builder setIsActive(boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", job='" + job + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
