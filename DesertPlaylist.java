import java.util.ArrayList;
public class DesertPlaylist
{
    public static void main(String[] args)
    {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        desertIslandPlaylist.add("Thunderstruck: ACDC");
        desertIslandPlaylist.add("Perfect: Ed Sheeran");
        desertIslandPlaylist.add("Memories: Maroon 5");
        desertIslandPlaylist.add("Dangerzone: TopGun");
        desertIslandPlaylist.add("Malibu Nights: Lany");
        System.out.println(desertIslandPlaylist);
        //checking the size of the playlist and removing one song from the playlist
        System.out.println(desertIslandPlaylist.size());
        desertIslandPlaylist.remove("Perfect: Ed Sheeran");
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());
        //switching the position of two songs by either getting their index by song name or by getting the songname on that particular index
        System.out.println("The index of the Thunderstruck song is " +desertIslandPlaylist.indexOf("Thunderstruck: ACDC"));
        String swtichsong1 = desertIslandPlaylist.get(0);
        System.out.println(swtichsong1);
        System.out.println("The index of the Malibu Nights song is " +desertIslandPlaylist.indexOf("Malibu Nights: Lany"));
        String swtichsong2 = desertIslandPlaylist.get(3);
        System.out.println(swtichsong2);
        desertIslandPlaylist.set(0, swtichsong2);
        desertIslandPlaylist.set(3, swtichsong1);
        System.out.println(desertIslandPlaylist);
    }
}