package iphone;

import interfaces.MusicPlayer;
import interfaces.Phone;
import interfaces.WebBrowser;

public class Iphone implements MusicPlayer, Phone, WebBrowser {

    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    @Override
    public void pause() {
        System.out.println("Music paused.");
    }

    @Override
    public void stop() {
        System.out.println("Playback stopped.");
    }

    @Override
    public void call() {
        System.out.println("Calling...");
    }

    @Override
    public void answer() {
        System.out.println("Answering call...");
    }

    @Override
    public void startVoicemail() {
        System.out.println("Starting voicemail...");
    }

    @Override
    public void displayPage(String url) {
        System.out.println("Displaying page: " + url);
    }

    @Override
    public void openNewTab(String url) {
        System.out.println("Opening new tab with page: " + url);
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page...");
    }
}
