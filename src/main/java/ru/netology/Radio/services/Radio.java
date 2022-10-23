package ru.netology.Radio.services;

public class Radio {

    public int currentVolume;
    public int currentStation;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 9) {
            currentStation = newCurrentStation;
        }
        if (newCurrentStation > 0) {
            currentStation = newCurrentStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume >= 10) {
            return;
        } else {
            currentVolume = currentVolume + 1;   // порверен
        }
    }

    public void decreaseVolume() {
        if (currentVolume <= 0) {
            return;
        } else {
            currentVolume = currentVolume - 1;   // проверен
        }
    }


    public void nextRadioStation() {
        if (currentStation >= 9) {
            setCurrentStation(0);
        } else {
            currentStation = currentStation + 1;  //проверен
        }
    }

    public void prevRadioStation() {
        if (currentStation <= 0) {
            setCurrentStation(9);
        } else {
            currentStation = currentStation - 1;
        }
    }


}

