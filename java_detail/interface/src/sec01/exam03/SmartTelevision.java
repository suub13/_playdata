package sec01.exam03;

import sec01.exam02.RemoteControl;

public class SmartTelevision implements sec01.exam03.RemoteControl, Searchable{
    private int volume;
    public void turnOn(){
        System.out.println("TV를 켭니다.");
    }
    public void turnOff(){
        System.out.println("TV를 끕니다.");
    }
    public void setVolume(int volume){
        if(volume > sec01.exam02.RemoteControl.MAX_VOLUME) {
            this.volume = sec01.exam02.RemoteControl.MAX_VOLUME;
        }else if(volume< sec01.exam02.RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: "+this.volume);
    }

    public void search(String url){
        System.out.println(url+"을 검색합니다.");
    }
}
