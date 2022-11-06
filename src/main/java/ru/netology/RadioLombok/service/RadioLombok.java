package ru.netology.RadioLombok.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor

@Data
public class RadioLombok {

    public int minVolume = 0;
    public int maxVolume = 100;
    public int minStation = 0;
    public int maxStation = 9;
    public int currentVolume = 0;
    public int currentStation = minStation;
    public int sizeStation = 10;

    public RadioLombok(int minVolume, int maxVolume, int minStation, int maxStation, int currentVolume, int currentStation, int sizeStation) {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentVolume = currentVolume;
        this.currentStation = currentStation;
        this.sizeStation = sizeStation;
    }
}
