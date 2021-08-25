package com.example.hybrid_calculator;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    private MutableLiveData<String> intext = new MutableLiveData<>();
    private MutableLiveData<String> optext = new MutableLiveData<>();
    public static MutableLiveData<Integer> equalcon = new MutableLiveData<>();
    public void setText(String input) {
        intext.setValue(input);
    }

    public LiveData<String> getText() {
        return intext;
    }

    public void setOptext(String input) {
        optext.setValue(input);
    }

    public LiveData<String> getOpText() {
        return optext;
    }
    public void setEqualcon(Integer input) {
        equalcon.setValue(input);
    }
    public LiveData<Integer> getequalcon() {
        return equalcon;
    }












}
