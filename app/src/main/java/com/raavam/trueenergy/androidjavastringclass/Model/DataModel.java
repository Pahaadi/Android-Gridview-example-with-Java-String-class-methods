package com.raavam.trueenergy.androidjavastringclass.Model;

public class DataModel {
    String CodeJava;
    String Output;
    String Explanation;

    public DataModel(String codeJava, String output, String explanation) {
        this.CodeJava = codeJava;
        this.Output = output;
        this.Explanation = explanation;
    }

    public String getCodeJava() {
        return CodeJava;
    }

    public void setCodeJava(String codeJava) {
        CodeJava = codeJava;
    }

    public String getOutput() {
        return Output;
    }

    public void setOutput(String output) {
        Output = output;
    }

    public String getExplanation() {
        return Explanation;
    }

    public void setExplanation(String explanation) {
        Explanation = explanation;
    }
}
