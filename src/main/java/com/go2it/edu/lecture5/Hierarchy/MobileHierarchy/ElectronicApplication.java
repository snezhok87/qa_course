package com.go2it.edu.lecture5.Hierarchy.MobileHierarchy;

public class ElectronicApplication {
    public static void main(String[] args) {
        IPhone iPhonePRO = new IPhone(5,1050, "pink", 5.8, 6);
        //        call parent methods MobilePhone
        iPhonePRO.ring();
        iPhonePRO.textMessage("How are you?");
        //        call parent methods Smart Phone
        iPhonePRO.playMusic("Dance-dance");
        iPhonePRO.watchVideo("TV show - Friends");
        iPhonePRO.navigate("Home");

        //call unique method
        iPhonePRO.askSiri("Tell me a joke");

        Android galaxyS = new Android(4, MobilePhone.MobileProducer.SAMSUNG, 250, "gold", 4, 2);
        galaxyS.heyGoogle("Call to Jane");
        galaxyS.navigate("School");
        galaxyS.ring("La-la-la", true);
    }
}
