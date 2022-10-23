import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio.services.Radio;

public class RadioTest {

    // Volume Tests

    @Test
    public void shouldIncreaseVolumeFromZeroCurrent() {

        Radio Volume = new Radio();
        Volume.setCurrentVolume(0);

        Volume.increaseVolume();

        int expected = 1;
        int actual = Volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldNotIncreaseVolumeMoreThenMax(){
        Radio Volume =new Radio();
        Volume.setCurrentVolume(10);

        Volume.increaseVolume();

        int expected = 10;
        int actual = Volume.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
@Test
public void shouldIncreaseVolumeUpZeroCurrent(){
    Radio Volume = new Radio();
    Volume.setCurrentVolume(8);

    Volume.increaseVolume();

    int expected = 9;
    int actual = Volume.getCurrentVolume();

    Assertions.assertEquals(expected, actual);
}

    @Test
    public void negativeValueOfVolume() {
        Radio Volume = new Radio();
        Volume.setCurrentVolume(-3);

        int expected = 0;
        int actual = Volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeMoreThanMax() {
        Radio Volume = new Radio();
        Volume.setCurrentVolume(14);

        int expected = 0;
        int actual = Volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void anderThanBoundaryValueOfVolume() {

        Radio Volume = new Radio();
        Volume.setCurrentVolume(10);

        Volume.increaseVolume();

        int expect = 10;
        int actual = Volume.getCurrentVolume();

        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldNotSetVolumeMoreThanBoundaryValue() {
        Radio Volume = new Radio();
        Volume.setCurrentVolume(11);

        int expected = 0;
        int actual = Volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume() {

        Radio Volume = new Radio();
        Volume.setCurrentVolume(5);

        Volume.decreaseVolume();

        int expected = 4;
        int actual = Volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotDecreaseInCaseOfZeroVolume() {

        Radio Volume = new Radio();
        Volume.setCurrentVolume(0);

        Volume.decreaseVolume();

        int expected = 0;
        int actual = Volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseAnderZeroVolume() {
        Radio Volume = new Radio();
        Volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = Volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    // Stations Tests

    @Test
    public void shouldSetNewStation() {

        Radio Station = new Radio();
        Station.setCurrentStation(7);

        int expected = 7;
        int actual = Station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationMoreThanMaxNumberOfStation() {
        Radio Station = new Radio();
        Station.setCurrentStation(11);

        int expected = 0;
        int actual = Station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationThenMinNumberOfStation() {
        Radio Station = new Radio();
        Station.setCurrentStation(-1);

        int expected = 0;
        int actual = Station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {

        Radio Station = new Radio();
        Station.getCurrentStation();

        Station.nextRadioStation();

        int expected = 1;
        int actual = Station.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetZiroStationAfterNineStation() {
        Radio Station = new Radio();
        Station.setCurrentStation(9);

        Station.nextRadioStation();

        int expected = 0;
        int actual = Station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNineStationAfterZiroStation() {
        Radio Station = new Radio();
        Station.setCurrentStation(0);

        Station.prevRadioStation();

        int expected = 9;
        int actual = Station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevStation() {
        Radio Station = new Radio();
        Station.setCurrentStation(4);

        Station.prevRadioStation();

        int expected = 3;
        int actual = Station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
