package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setStation() {
        Radio station =  new Radio(20);

        station.setCurrentStation(5);

        int expected = 5;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxStation() {
        Radio station =  new Radio(20);

        station.setCurrentStation(19);

        int expected = 19;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMinStation() {
        Radio station =  new Radio(20);

        station.setCurrentStation(0);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setLowerStation() {
        Radio station =  new Radio(20);

        station.setCurrentStation(-3);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setHigherStation() {
        Radio station =  new Radio(20);

        station.setCurrentStation(21);

        int expected = 19;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio station =  new Radio(20);

        station.setCurrentStation(18);
        station.next();

        int expected = 19;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextHigherStation() {
        Radio station =  new Radio(20);

        station.setCurrentStation(19);
        station.next();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio station =  new Radio(20);

        station.setCurrentStation(1);
        station.prev();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevLowerStation() {
        Radio station =  new Radio(20);

        station.setCurrentStation(0);
        station.prev();

        int expected = 19;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume() {
        Radio volume =  new Radio();

        volume.setCurrentVolume(5);

        int expected = 5;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxVolume() {
        Radio volume =  new Radio();

        volume.setCurrentVolume(100);

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMinVolume() {
        Radio volume =  new Radio();

        volume.setCurrentVolume(0);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setLowerVolume() {
        Radio volume =  new Radio();

        volume.setCurrentVolume(-5);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setHigherVolume() {
        Radio volume =  new Radio();

        volume.setCurrentVolume(111);

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio volume =  new Radio();

        volume.setCurrentVolume(55);
        volume.increaseVolume();

        int expected = 56;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseHigherVolume() {
        Radio volume =  new Radio();

        volume.setCurrentVolume(100);
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio volume =  new Radio();

        volume.setCurrentVolume(55);
        volume.decreaseVolume();

        int expected = 54;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseLowerVolume() {
        Radio volume =  new Radio();

        volume.setCurrentVolume(0);
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
