import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio.services.Radio;

public class RadioTest {

    // Volume Tests

    @Test
    public void shouldNotDecreaseVolumeDownThan0() {

        Radio Volume = new Radio();
        Volume.decreaseVolume();

        int expected = 0;
        int actual = Volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeMoreThan100() {
        Radio Volume = new Radio();
        Volume.setCurrentVolume(100);
        Volume.increaseVolume();

        int expected = 100;
        int actual = Volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeMoreThanMax() {
        Radio Volume = new Radio();
        Volume.setCurrentVolume(101);

        Assertions.assertEquals(100, Volume.getCurrentVolume());
    }
    @Test
    public void shouldNotSetVolumeDownThanMin(){
        Radio Volume = new Radio();
        Volume.setCurrentVolume(-24);
        Assertions.assertEquals(0,Volume.getCurrentVolume());
    }

    @Test
    public void shouldIncreaaseVolume(){
        Radio Volume =new Radio();
        Volume.increaseVolume();
        Assertions.assertEquals(1,Volume.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume(){
        Radio Volume = new Radio();
        Volume.setCurrentVolume(30);
        Volume.decreaseVolume();
        Assertions.assertEquals(29,Volume.getCurrentVolume());
    }

    @Test
    public void shouldSetNextStationInBoundarySituation() { // Проверка переключения на следеющую станцию + проверка верхних граничных значений + проверка принудительной установки станции
        Radio Station = new Radio(9);
        Station.setCurrentStation(9);
        Station.nextRadioStation();

        Assertions.assertEquals(0, Station.getCurrentStation());
    }
    @Test
    public void shouldSetNextStationInOrdinarySituation(){
        Radio Station = new Radio();
        Station.setCurrentStation(4);
        Station.nextRadioStation();
        Assertions.assertEquals(5,Station.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStationInBoundarySituation() {   // Проверка переключения на предыдущую станцию + проверка нижних граничных значений
        Radio Station = new Radio();

        Station.prevRadioStation();

        Assertions.assertEquals(9, Station.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStation() {
        Radio Station = new Radio();
        Station.setCurrentStation(6);
        Station.prevRadioStation();

        Assertions.assertEquals(5, Station.getCurrentStation());
    }

    @Test
    public void shouldSetStationManual() { // Доп. Проверка принудительной установки станции
        Radio Station = new Radio();

        Station.setCurrentStation(4);

        Assertions.assertEquals(4, Station.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationWithWrongNegativeNumber() {
        Radio Station = new Radio();

        Station.setCurrentStation(-5);

        Assertions.assertEquals(0, Station.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationWithWrongPositiveNumber() {
        Radio Station = new Radio();

        Station.setCurrentStation(90);
        Assertions.assertEquals(0, Station.getCurrentStation());
    }

}
