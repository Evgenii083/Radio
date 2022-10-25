package ru.netology.Radio.services;

public class Radio {
    public int minVolume = 0;
    public int maxVolume = 100;
    public int minStation = 0;
    public int maxStation = 9;
    public int currentVolume = 0;
    public int currentStation = minStation;

    public Radio() {

    }

    public Radio(int size) {
        maxStation = minStation + size;
    }

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


