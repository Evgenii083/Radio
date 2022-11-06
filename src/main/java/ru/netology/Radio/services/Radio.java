package ru.netology.Radio.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class Radio {

    public int minVolume = 0;
    public int maxVolume = 100;
    public int minStation = 0;
    public int maxStation = 9;
    public int currentVolume = 0;
    public int currentStation = minStation;
    public int sizeStation = 10;


//    public Radio() {
//        this.currentStation = this.minStation;
//        this.sizeStation = 10;
//    }

//    public Radio(int minVolume, int maxVolume, int minStation, int maxStation, int currentVolume, int currentStation, int sizeStation) {
//        this.currentStation = this.minStation;
//        this.sizeStation = 10;
//        this.minVolume = minVolume;
//        this.maxVolume = maxVolume;
//        this.minStation = minStation;
//        this.maxStation = maxStation;
//        this.currentVolume = currentVolume;
//        this.currentStation = currentStation;
//        this.sizeStation = sizeStation;
//    }


//    public Radio() {
//
//    }

//    public Radio(int size) {
//        maxStation = minStation + size;
//    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }

        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < maxStation) {
            currentStation = newCurrentStation;
        }
        if (newCurrentStation > minStation) {
            currentStation = newCurrentStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume >= maxVolume) {
            currentVolume = currentVolume + 0;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume <= minVolume) {
            currentVolume = currentVolume - 0;
        } else {
            currentVolume = currentVolume - 1;
        }
    }


    public void nextRadioStation() {
        if (currentStation >= maxStation) {
            setCurrentStation(0);
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevRadioStation() {
        if (currentStation <= minStation) {
            setCurrentStation(9);
        } else {
            currentStation = currentStation - 1;
        }
    }
}




