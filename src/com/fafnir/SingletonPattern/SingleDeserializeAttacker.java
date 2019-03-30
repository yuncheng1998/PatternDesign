package com.fafnir.SingletonPattern;

import java.io.*;

public class SingleDeserializeAttacker {

    public static boolean attackWithDeserialize(AbstractSingleton instance) {

        String path = "/Users/yuncheng/IdeaProjects/PatternDesign/src/com/fafnir/SingletonPattern/stream/" + instance.toString();
        AbstractSingleton instanceFromDeserialize = null;
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(
                    new FileOutputStream(path));
            outputStream.writeObject(instance);
            outputStream.close();
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path));
            instanceFromDeserialize = (AbstractSingleton) inputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return false;
        } catch (IOException e) {
            System.out.println(e);
            return false;
        } catch (ClassNotFoundException e) {
            System.out.println(e);
            return false;
        }

        return instance != instanceFromDeserialize;
    }


    public static boolean attackWithDeserialize(SingletonWithEnum instance) {

        String path = "/Users/yuncheng/IdeaProjects/PatternDesign/src/com/fafnir/SingletonPattern/stream/" + instance.toString();
        SingletonWithEnum instanceFromDeserialize = null;
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(
                    new FileOutputStream(path));
            outputStream.writeObject(instance);
            outputStream.close();
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path));
            instanceFromDeserialize = (SingletonWithEnum) inputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return false;
        } catch (IOException e) {
            System.out.println(e);
            return false;
        } catch (ClassNotFoundException e) {
            System.out.println(e);
            return false;
        }

        return instance != instanceFromDeserialize;
    }

}
