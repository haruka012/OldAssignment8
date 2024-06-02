package com.zoo.zoo;

public class AnimalSearchRequest {
    private String startsWith;
    private String endsWith;
    private String contains;

    public AnimalSearchRequest(String startsWith, String endsWith, String contains) {
        this.startsWith = startsWith;
        this.endsWith = endsWith;
        this.contains = contains;
    }


    public String getStartsWith() {
        return startsWith;
    }

    public String getEndsWith() {
        return endsWith;
    }

    public String getContains() {
        return contains;
    }



    public void setStartsWith(String startsWith) {
        this.startsWith = startsWith;
    }

    public void setEndsWith(String endsWith) {
        this.endsWith = endsWith;
    }

    public void setContains(String contains) {
        this.contains = contains;
    }


}
