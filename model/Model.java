package com.javarush.task.task36.task3608.model;

public interface Model {
    ModelData getModelData();

    void deleteUserById(long id);

    void loadUsers();

    void loadDeletedUsers();

    void loadUserById(long userId);

    void changeUserData(String name, long id, int level);
}
