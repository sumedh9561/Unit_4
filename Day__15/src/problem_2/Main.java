package problem_2;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PlayList pl=new PlayList();
        pl.addSong(new Song("Bramhastra", "Kesariya tera ishq hai piya"));
        pl.addSong(new Song("Shersha", "Ratta lambiya"));
        pl.addSong(new Song("Kabir Singh", "Bekhayali"));
        pl.addSong(new Song("Jersey", "Bin tere kya Yara mera"));

        for(Song s:pl.songs){
            s.play();
        }

    }

}