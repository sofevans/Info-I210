public class TestTV { //9.3 defines tv class; 9.4 uses tv class to create two objects
  public static void main(String[] args) {
    TV tv1 = new TV(); // Create a TV
    tv1.turnOn();
    tv1.setChannel(30);
    tv1.setVolume(3);

    Tv tv2 = new TV();
    tv2.turnOn();
    tv2.channelUp();
    tv2.channelUp();
    tv2.volumeUp();

  System.out.println("tv1's channel is " + tv1.channel
                     + " and volume level is " + tv.volumeLevel);
  System.out.println("tv2's channel is " + tv2.channel
                     + "and volume level is " + tv2.volumeLevel);
  }
}
