package com.fitbit.sampleandroidoauth2;



public class globals {
    private static globals instance;
    private static int fsteps;

    //private globals(){}

    public void setSteps( int t){
        globals.fsteps=t;
    }

    public int getSteps(){
        return  globals.fsteps;

     }

    public static synchronized globals getInstance()
    {
        if(instance==null)
        {
            instance=new globals();
        }
        return instance;
    }

}

