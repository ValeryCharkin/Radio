import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Radio;

public class RadioTest {

        Radio radio = new Radio();
        @Test
        public void increaseVolume() {   //прибавить громкость
            radio.setCurrentVolume(5);
            radio.volumeUp();

            int expected = 6;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void increaseVolumeMoreMax() {   //прибавить громкость больше Max
            radio.setCurrentVolume(101);
            radio.volumeUp();

            int expected = 101;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void decreaseVolume() {      //убавить громкость
            radio.setCurrentVolume(5);
            radio.volumeDown();

            int expected = 4;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void decreaseVolumeLessMin() {      //убавить громкость меньше Min
            radio.setCurrentVolume(0);
            radio.volumeDown();

            int expected = 0;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void setStation() {      //выбор станции
            radio.setCurrentRadioStation(9);

            int expected = 9;
            int actual = radio.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void setStationMoreMax() {   //выбор станции больше Max
            radio.setCurrentRadioStation(10);

            int expected = 0;
            int actual = radio.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void setStationLessMin() {   //выбор станции меньше Min
            radio.setCurrentRadioStation(-1);

            int expected = 0;
            int actual = radio.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void nextStation() {     //следующая станция
            radio.setCurrentRadioStation(5);
            radio.next();

            int expected = 6;
            int actual = radio.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        public void nextStationAfterMax() {     //следующая станция после Max
            radio.setCurrentRadioStation(9);
            radio.next();

            int expected = 0;
            int actual = radio.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        public void prevStation() {     //предыдущая станция
            radio.setCurrentRadioStation(5);
            radio.prev();

            int expected = 4;
            int actual = radio.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        public void prevStationAfterMin() {     //предыдущая станция после Min
            radio.setCurrentRadioStation(0);
            radio.prev();

            int expected = 9;
            int actual = radio.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }
    }