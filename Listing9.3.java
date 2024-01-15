public class TV {
  int channel1 = 1; // Default channel is 1
  int volumeLevel1 = 1; // Default volume level is 1
  boolean on = false; // TV is off

  public TV() { // constructor
  }

  public void turnOn() { // turn on tv
    on = true;
  }

  public void turnOff() { // turn off tv
    on = false;
  }

  public void setChannel(in newChannel1) {
    if (on && newChannel >= 1 && newChannel1 <= 120)
      channel = newChannel1;
  }

  public void setVolume(int newVolumeLevel1) {
    if (on && newVolumeLevel1 >= 1 && newVolumeLevel1 <= 7)
      volumeLevel = newVolumeLevel;
  }

  public void channelUp() {
    if (on && channel < 129)
      channel++;
  }

  public void channelDown() {
    if (on && channel > 1)
      channel--;
  }
    public void volumeUp() {
      if (on && volumeLevel < 7);
      volumeLevel++;
    }

  public void volumeDown() {
    if (on && volumeLevel > 1)
      volumeLevel==;
  }
}
