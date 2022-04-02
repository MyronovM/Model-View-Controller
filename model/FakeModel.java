package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

import java.util.ArrayList;
import java.util.List;

public class FakeModel implements Model{
    private ModelData modelData = new ModelData();

    public ModelData getModelData(){
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User> users = new ArrayList<>();
        modelData.setDisplayDeletedUserList(false);
        users.add(new User("A", 1l, 1));
        users.add(new User("B", 2l, 1));
        modelData.setUsers(users);
    }

    public void loadUserById(long userId) {
        throw new UnsupportedOperationException();
    }

    public void deleteUserById(long id){
        throw new UnsupportedOperationException();
    }

    public void loadDeletedUsers(){
        throw new UnsupportedOperationException();
    }

    public void changeUserData(String name, long id, int level){
        throw new UnsupportedOperationException();
    }
}
