package objectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class songs {
    static class Song {
        String typeList;
        String name;
        String time;


        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }

        public String getTime() {
            return this.time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberSongs = Integer.parseInt(scanner.nextLine());

        List<Song> songList = new ArrayList<>();
        for (int i = 0; i < numberSongs; i++) {


            String inputLine = scanner.nextLine();
            String[] inputSongs = inputLine.split("_");
            Song currentSong = new Song(inputSongs[0], inputSongs[1], inputSongs[2]);
            songList.add(currentSong);

        }
        String command = scanner.nextLine();

        if (command.equals("all")) {

            for (Song item : songList) {
                System.out.println(item.getName());
            }
        } else {
            for (Song item : songList) {
                if (item.getTypeList().equals(command)) {
                    System.out.println(item.getName());

                }
            }
        }
    }

}