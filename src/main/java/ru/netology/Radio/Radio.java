package ru.netology.Radio;

public class Radio {
    private int currentStation ;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int stationCount) {
        this.maxStation = stationCount - 1;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 0) {
            currentStation = newCurrentStation;
            if (newCurrentStation > maxStation ) {
                currentStation = maxStation;
            }
        } else {
            currentStation = 0;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 0) {
            currentVolume = newCurrentVolume;
            if (newCurrentVolume > 100 ) {
                currentVolume = 100;
            }
        } else {
            currentVolume = 0;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void next() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
