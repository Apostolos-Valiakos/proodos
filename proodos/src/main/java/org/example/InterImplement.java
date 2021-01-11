package org.example;

public class InterImplement implements INetwork{
    static int noOfTries = 0;
    @Override
    public boolean sendMessage(String ip, String message) {
        noOfTries++;
        if(noOfTries==1){
            return false;
        }
        else{
            noOfTries=0;
            return true;
        }
    }
}
