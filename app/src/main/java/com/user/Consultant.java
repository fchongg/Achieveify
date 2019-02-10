package com.user;

import com.user.Child;
import java.util.*;

public class Consultant {
    Map<String, Child> children;
    Map<String, Helper> helpers;
    Child currChild;
    String email, password;

    public Consultant(String email, String password) {
        this.email = email;
        this.password = password;
        children = new HashMap<String, Child>();
        helpers = new HashMap<String, Helper>();

    }

    private void addChild(String name) {
        if (!children.containsKey(name)) {
            Child newChild = new Child(name);
            children.put(name, newChild);
        }
    }

    private void removeChild(String name) {
        if (children.containsKey(name)) {
            children.remove(name);
        }
    }

    private void setName (String name){
        currChild.name = name;
    }
    

    protected void setReward(Child child, String reward_name) {

    }
}
