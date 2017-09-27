package com.example.yashwantsingh.weatherdetails;

/**
 * Created by yashwantsingh on 16/08/17.
 */

public class BuilderPatternExample {

    public MereChoteBhai getMereChoteBhai(){
        return new MereChoteBhai().
                addBigBrother("Maggu").
                addChinnaBrother("Coffee").
                build();
    }
}

class MereChoteBhai{

    String bigBrotherName;
    String smallBrotherName;

    public MereChoteBhai(){
    }

    public MereChoteBhai addBigBrother(String brotherName){
        this.bigBrotherName = brotherName;
        return this;
    }

    public MereChoteBhai addChinnaBrother(String brotherName){
        this.smallBrotherName = brotherName;
        return this;
    }

    public MereChoteBhai build(){
        return this;
    }

    public String getBigBrother(){
        return bigBrotherName;
    }

    public String getSmallBrother(){
        return smallBrotherName;
    }

}