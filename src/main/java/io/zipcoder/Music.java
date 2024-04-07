package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int minNumberPressed = 0;
        //search for the selection up
        for(int i = 1; i<playList.length; i++){
            if(playList[(startIndex + i)% playList.length].equals(selection)){
                minNumberPressed = i;
                break;
            }
        }
        //search for the song selection down
        for(int i= 1; i< playList.length; i++){
            if(playList[(playList.length + startIndex - i)% playList.length].equals(selection)){
                if(i< minNumberPressed){
                    minNumberPressed = i;
                }
                break;
            }
        }
        return  minNumberPressed;

    }
}
